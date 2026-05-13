package watermanagment;

public class Operator {

    private int operatorId;
    private String name;
    private String supplyZone;
    private String schedule;

    public Operator(int operatorId, String name, String supplyZone, String schedule) {
        this.operatorId = operatorId;
        this.name = name;
        this.supplyZone = supplyZone;
        this.schedule = schedule;
    }

    public void controlSupply() {
        System.out.println("Operator " + name + " is controlling supply.");
    }

    public void updateSchedule(String newSchedule) {
        schedule = newSchedule;
        System.out.println("Schedule updated to: " + schedule);
    }

    public void monitorFlow() {
        System.out.println("Monitoring water flow...");
    }

    public void stopSupply() {
        System.out.println("Water supply stopped.");
    }
}