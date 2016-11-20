public class Rodent {

    public Rodent() {
        System.out.println("Rodent Constructor Run");
    }

    public void nibble() {
        System.out.println("Nibble");
    }

    public void run() {
        System.out.println("Run");
    }
}

class Mouse extends Rodent {

    public Mouse() {
        System.out.println("Mouse Constructor Run");
    }

    public void nibble() {
        super.nibble();
        System.out.println("on small piece of cheese");
    }
}

class Gerbil extends Rodent {
    Mouse m = new Mouse();

    public Gerbil() {
        System.out.println("Gerbil Constructor Run");
    }

    public  void run() {
        System.out.println("Gerbils don't run dummy");
    }
    public void nibble() {
        super.nibble();
        System.out.println("on Gerbil food");
    }
}

class Hamster  extends Rodent {

    public Hamster() {
        System.out.println("Hamster Constructor Run");
    }

    public void nibble() {
        super.nibble();
        System.out.println("on Hamster  food");
    }

}
