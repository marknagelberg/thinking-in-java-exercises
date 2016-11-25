public class Rodent {

    public Rodent() {
        System.out.println("Rodent Constructor Run");
    }

    public void nibble() {
        System.out.println("Nibble");
    }

    public void run() {
        System.out.println("Run");
    }
}

class Mouse extends Rodent {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;

    public Mouse() {
        System.out.println("Mouse Constructor Run");
    }

    public void nibble() {
        super.nibble();
        System.out.println("on small piece of cheese");
    }

    public void addRef() { refcount++; }

    protected void dispose() {
        if(--refcount == 0)
            System.out.println("Disposing Mouse " + this);
    }

    public String toString() { return "Mouse " + id; }
}

class Gerbil extends Rodent {
    Mouse m = new Mouse();

    public Gerbil() {
        System.out.println("Gerbil Constructor Run");
    }

    public  void run() {
        System.out.println("Gerbils don't run dummy");
    }
    public void nibble() {
        super.nibble();
        System.out.println("on Gerbil food");
    }
}

class Hamster extends Rodent {

    private Mouse shared_mouse;
    private static long counter = 0;
    private final long id = counter++;

    public Hamster(Mouse shared_mouse) {
        this.shared_mouse = shared_mouse;
        this.shared_mouse.addRef();
        System.out.println("Hamster Constructor Run");
    }

    protected void dispose() {
        System.out.println("disposing " + this);
        shared_mouse.dispose();
    }

    public void nibble() {
        super.nibble();
        System.out.println("on Hamster  food");
    }
    public String toString() { return "Hamster " + id; }

}
