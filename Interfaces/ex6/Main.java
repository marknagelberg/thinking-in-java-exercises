public class Main {

    public static void main(String[] args) {
        Implementor i = new Implementor();
        i.method(); //Throws error, becuase method1() was implicitly public
                    //and Implementor tries to assign it weaker privileges (package access)

    }
}