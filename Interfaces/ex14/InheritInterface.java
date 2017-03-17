interface CanRun {
    void runSlow();
    void runFast();
}

interface CanJump {
    void jumpLow();
    void jumpHigh();
}

interface CanSquat {
    void squatLong();
    void squatShort();
}

interface CanRunJumpSquat extends CanRun, CanJump, CanSquat {
    void anotherPower();
}

class Hero {
    void fly() {
        System.out.println("Flying!");
    }
}

class ActionHero extends Hero implements CanRunJumpSquat {
    public void runSlow() {
        System.out.println("Run slow");
    }
    public void runFast() {
        System.out.println("Run Fast");
    }

    public void jumpLow() {
        System.out.println("Jump Low");
    }

    public void jumpHigh() {
        System.out.println("Jump High");
    }

    public void squatLong() {
        System.out.println("Squat Long");
    }
    public void squatShort() {
        System.out.println("Squat Short");
    }

    public void anotherPower() {
        System.out.println("Another Power!");
    }
}

public class InheritInterface {

    public static void main(String[] args) {
        ActionHero obj = new ActionHero();
        canRunArg(obj);
        canJumpArg(obj);
        canSquatArg(obj);
        canRunJumpSquatArg(obj);
    }

    public static void canRunArg(CanRun r) {
        r.runSlow();
    }
    public static void canJumpArg(CanJump j) {
        j.jumpHigh();
    }
    public static void canSquatArg(CanSquat s) {
        s.squatLong();
    }
    public static void canRunJumpSquatArg(CanRunJumpSquat a) {
        a.anotherPower();
    }
}
