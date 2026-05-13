package watermanagment;

import java.util.ArrayList;

public class WaterSystem {

    private double totalWaterSupply;
    private ArrayList<String> usageData;
    private boolean leakageStatus;

    public WaterSystem(double totalWaterSupply) {
        this.totalWaterSupply = totalWaterSupply;
        this.usageData = new ArrayList<>();
        this.leakageStatus = false;
    }

    public void trackUsage(Consumer consumer) {

        String data = consumer.getName() + " used " + consumer.getWaterUsage() + " litres";
        usageData.add(data);

        System.out.println("Usage tracked successfully.");
    }

    public void detectLeakage() {

        if (leakageStatus) {
            System.out.println("Leakage detected.");
        } else {
            System.out.println("No leakage detected.");
        }
    }

    public void generateConsumptionReport() {

        System.out.println("\n----- CONSUMPTION REPORT -----");

        for (String data : usageData) {
            System.out.println(data);
        }
    }

    public void sendAlert(String message) {
        System.out.println("ALERT: " + message);
    }

    public void setLeakageStatus(boolean status) {
        this.leakageStatus = status;
    }
}