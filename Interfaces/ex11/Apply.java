public class Apply {
    static String s = "Test Strings";
    public static void process(Processor p, Object s) {
        System.out.println(p.process(s));
    }

    public static void main(String[] args) {
        process(new Swap(), s);
    }
}
