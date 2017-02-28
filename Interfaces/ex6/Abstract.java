interface Interface {
    void test();
}

class Other implements Interface {
    void test() {
        System.out.println("Test"); //Produces an error because you 
                                    //are assigning package access and it was previously public
    }
}

public class Abstract {
    public static void main(String[] args) {
        Other o = new Other();
        o.test();
    }
}

