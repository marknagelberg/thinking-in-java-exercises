class AlertStatus {
    public void report() {};
}

class OkStatus extends AlertStatus {
    public void report() { System.out.println("Status OK"); }
}

class WarningStatus  extends AlertStatus {
    public void report() { System.out.println("Status Warning"); }
}

class DangerStatus extends AlertStatus {
    public void report() { System.out.println("Status Danger"); }
}

class Starship {

    AlertStatus status = new OkStatus();

    public void changeStatusToOk() {
        status = new OkStatus();
        System.out.println("Changed Status to OK");
    }

    public void changeStatusToWarning() {
        status = new WarningStatus();
        System.out.println("Changed Status to Warning");
    }

    public void changeStatusToDanger() {
        status = new DangerStatus();
        System.out.println("Changed Status to Danger");
    }

    public void reportStatus() {
        status.report();
    }

}

public class Transmogrify {
    public static void main(String[] args) {
        Starship ship = new Starship();
        ship.reportStatus();
        ship.changeStatusToWarning();
        ship.reportStatus();
        ship.changeStatusToDanger();
        ship.reportStatus();
        ship.changeStatusToOk();
        ship.reportStatus();
    }
}
