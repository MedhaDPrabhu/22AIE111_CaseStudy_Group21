package watermanagment;

public class Consumer {

    private int consumerId;
    private String name;

    private double waterUsage;
    private double billAmount;

    public Consumer(int consumerId, String name) {
        this.consumerId = consumerId;
        this.name = name;
        this.waterUsage = 0;
        this.billAmount = 0;
    }

    public int getConsumerId() {
        return consumerId;
    }

    public String getName() {
        return name;
    }

    public double getWaterUsage() {
        return waterUsage;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void useWater(double litres) {
        waterUsage += litres;
        billAmount = waterUsage * 2;

        System.out.println(name + " used " + litres + " litres.");
    }

    public void viewUsage() {
        System.out.println("Consumer Name : " + name);
        System.out.println("Water Usage   : " + waterUsage + " litres");
        System.out.println("Bill Amount   : Rs." + billAmount);
    }

    public void payBill() {
        System.out.println(name + " paid Rs." + billAmount);
        billAmount = 0;
    }

    public void reportLeakage(WaterSystem system) {
        system.setLeakageStatus(true);
        System.out.println(name + " reported leakage.");
    }
}