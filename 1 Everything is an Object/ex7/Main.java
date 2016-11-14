public class Main {
    public static void main(String[] args) {
        Incrementable sf = new Incrementable();
        sf.increment();
        System.out.println(StaticTest.i);
        Incrementable.increment();
        System.out.println(StaticTest.i);
    }
}