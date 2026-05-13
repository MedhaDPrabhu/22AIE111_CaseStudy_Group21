package watermanagment;

public class Consumer {

    int consumerId;
    String name;
    String address;

    double waterUsage;
    double billAmount;

    Consumer(int consumerId, String name, String address) {

        this.consumerId = consumerId;
        this.name = name;
        this.address = address;

        waterUsage = 0;
        billAmount = 0;
    }

    void useWater(double litres) {

        waterUsage += litres;

        billAmount = waterUsage * 2;

        System.out.println(name + " used "
                + litres + " litres.");
    }

    void viewUsage() {

        System.out.println("Consumer Name : " + name);

        System.out.println("Water Usage   : "
                + waterUsage + " litres");

        System.out.println("Bill Amount   : Rs."
                + billAmount);
    }

    void payBill() {

        System.out.println(name + " paid Rs."
                + billAmount);

        billAmount = 0;
    }

    void reportLeakage(WaterSystem system) {

        system.leakageStatus = true;

        System.out.println(name
                + " reported leakage.");
    }
}
