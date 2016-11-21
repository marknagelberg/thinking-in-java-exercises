//: polymorphism/ReferenceCounting.java
// Cleaning up shared member objects.
class Shared {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;
    public Shared() {
    System.out.println("Creating " + this);
    }

    public void addRef() { refcount++; }
    protected void dispose() {
        //Lesson Learned - the line below decrements refcount
        //Same as writing a separate line of code refcount--;.
        //The decrement isn't just visible within the for loop.
        if(--refcount == 0)
            System.out.println("Disposing " + this);
    }
    public String toString() { return "Shared " + id; }

    protected void finalize() {
        if(refcount != 0) {
            System.out.println("Error! There are still references pointing  to Shared object!");
        }
    }
}

class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;
    public Composing(Shared shared) {
        System.out.println("Creating " + this);
        this.shared = shared;
        this.shared.addRef();
    }
    protected void dispose() {
        System.out.println("disposing " + this);
        shared.dispose();
    }
    public String toString() { return "Composing " + id; }
}

public class ReferenceCounting {
    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composing = { new Composing(shared),
          new Composing(shared), new Composing(shared),
          new Composing(shared), new Composing(shared) };

        for(Composing c : composing) {
            c.dispose();
            //Command below will trigger the error written in
            //finalize() for the first 4 calls since there are
            //still references pointing to shared object at garbage
            //collection, until the 5th and final call.
            shared.finalize();
        }
    }
}
