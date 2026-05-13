package watermanagment;

public class Operator {

    int operatorId;
    String name;

    String supplyZone;
    String schedule;

    Operator(int operatorId,
             String name,
             String supplyZone,
             String schedule) {

        this.operatorId = operatorId;
        this.name = name;
        this.supplyZone = supplyZone;
        this.schedule = schedule;
    }

    void controlSupply() {

        System.out.println("Operator "
                + name
                + " is controlling supply.");
    }

    void updateSchedule(String newSchedule) {

        schedule = newSchedule;

        System.out.println("Schedule updated to: "
                + schedule);
    }

    void monitorFlow() {

        System.out.println("Monitoring water flow...");
    }

    void stopSupply() {

        System.out.println("Water supply stopped.");
    }
}