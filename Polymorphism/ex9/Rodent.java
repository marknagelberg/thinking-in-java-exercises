public class Rodent {

    public void nibble() {
        System.out.println("Nibble");
    }

    public void run() {
        System.out.println("Run");
    }
}

class Mouse extends Rodent {
    public void nibble() {
        super.nibble();
        System.out.println("on small piece of cheese");
    }
}

class Gerbil extends Rodent {
    public  void run() {
        System.out.println("Gerbils don't run dummy");
    }
    public void nibble() {
        super.nibble();
        System.out.println("on Gerbil food");
    }
}

class Hamster  extends Rodent {

    public void nibble() {
        super.nibble();
        System.out.println("on Hamster  food");
    }

}
