class Cycle {
    public void ride() {
    }
}

class Unicycle extends Cycle {
    public void ride() { System.out.println("Riding Unicycle"); }
}

class Bicycle extends Cycle {
    public void ride() { System.out.println("Riding Bicycle"); }
}

class Tricycle extends Cycle {
    public void ride() { System.out.println("Riding Tricycle"); }
}

public class Main {
    public static void main(String[] args) {
        Cycle unicycle = new Unicycle();
        Cycle bicycle = new Bicycle();
        Cycle tricycle = new Tricycle();

        unicycle.ride();
        bicycle.ride();
        tricycle.ride();
    }
}
