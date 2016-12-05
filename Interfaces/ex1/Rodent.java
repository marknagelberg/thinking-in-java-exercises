abstract class Rodent {

    public abstract void nibble();

    public abstract void run();
}

class Mouse extends Rodent {
    public void nibble() {
        System.out.println("Mouse nibbles on small piece of cheese");
    }
    public void run() {
        System.out.println("Mouse running");
    }
}

class Gerbil extends Rodent {
    public void run() {
        System.out.println("Gerbils don't run dummy");
    }
    public void nibble() {
        System.out.println("Gerbil nomming on Gerbil food");
    }
}

class Hamster extends Rodent {

    public void nibble() {
        System.out.println("Hamster nibbling on on Hamster food");
    }
    public void run() {
        System.out.println("Hamster running");
    }

}
