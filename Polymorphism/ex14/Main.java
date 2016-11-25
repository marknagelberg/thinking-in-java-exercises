public class Main {
    public static void main(String[] args) {
        Mouse m = new Mouse();
        Hamster[]  h = { new Hamster(m), new Hamster(m), new Hamster(m) };

        for(Hamster hamster : h)
            hamster.dispose();
       }
}
