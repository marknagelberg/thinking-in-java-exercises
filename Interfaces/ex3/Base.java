abstract class Base {

    Base() {
        print();
    }

    abstract void print();
}

class Derived {
    int test = 1;

    void print() {
        System.out.println(test);
    }
}