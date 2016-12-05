public class Main {
    public static void main(String[] args) {
        Mouse m = new Mouse();
        Gerbil g = new Gerbil();
        Hamster h = new Hamster();
        System.out.println("Mouse run()");
        m.run();
        System.out.println("Gerbil run()");
        g.run();
        System.out.println("Hamster run()");
        h.run();

        System.out.println("Mouse nibble()");
        m.nibble();
        System.out.println("Gerbil nibble()");
        g.nibble();
        System.out.println("Hamster nibble()");
        h.nibble();

    }
}
