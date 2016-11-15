public class Main {
    public static void main(String[] args) {
        StaticVariable sv1 = new StaticVariable();
        StaticVariable sv2 = new StaticVariable();
        System.out.println("sv1.i : " + sv1.i);
        System.out.println("sv2.i : " + sv2.i);
        System.out.println("Reassigning sv1.i - make it one value higher");
        sv1.i++;
        System.out.println("sv1.i : " + sv1.i);
        System.out.println("sv2.i : " + sv2.i);
        System.out.println("Both object values incremented!");
    }
}