interface Rodent {

    public void nibble();
    public void run();
}

class Mouse implements Rodent {
    public void nibble() {
        System.out.println("Mouse nibble on small piece of cheese");
    }
    public void run() {
        System.out.println("Mouse run");
    }
}

class Gerbil implements Rodent {
    public void run() {
        System.out.println("Gerbils don't run dummy");
    }
    public void nibble() {
        System.out.println("Nibble on Gerbil food");
    }

    public void run() {
        System.out.println("Mouse run");
    }

    public void crawl() {
        System.out.println("Mouse crawl");
    }
}

class Gerbil implements Rodent {
    public void nibble() {
        System.out.println("Gerbil nibble");
    }

    public void run() {
        System.out.println("Gerbil run");
    }
}

class Hamster implements Rodent {

    public void run() {
        System.out.println("Hamster Runs");
    }
    public void nibble() {
        System.out.println("Nibble on  Hamster  food");
    }

}
