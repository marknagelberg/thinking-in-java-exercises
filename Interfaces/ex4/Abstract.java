abstract class Abstract {

}

class Derived extends Abstract {
    void method() {
        System.out.println("Method");
    }

    static void staticMethod(Abstract a) {
        
        ((Derived)a).method();

    }
}