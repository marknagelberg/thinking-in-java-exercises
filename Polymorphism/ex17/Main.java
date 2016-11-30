class Cycle {
    public void ride() {
    }
}

class Unicycle extends Cycle {
    public void ride() { System.out.println("Riding Unicycle"); }

    public void balance() { System.out.println("Unicycle Balancing"); }
}

class Bicycle extends Cycle {
    public void ride() { System.out.println("Riding Bicycle"); }

    public void balance() { System.out.println("Bicycle Balancing"); }
}

class Tricycle extends Cycle {
    public void ride() { System.out.println("Riding Tricycle"); }
}

public class Main {
    public static void main(String[] args) {
        Cycle unicycle = new Unicycle();
        Cycle bicycle = new Bicycle();
        Cycle tricycle = new Tricycle();

        ((Unicycle)unicycle).balance();
        ((Bicycle)bicycle).balance();
        ((Tricycle)tricycle).balance();
    }
}
