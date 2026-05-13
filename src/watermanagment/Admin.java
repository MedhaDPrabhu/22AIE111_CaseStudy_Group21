package watermanagment;

import java.util.ArrayList;

public class Admin {

    private int adminId;
    private String name;
    private String password;

    private ArrayList<Consumer> consumers;

    public Admin(int adminId, String name, String password) {
        this.adminId = adminId;
        this.name = name;
        this.password = password;
        consumers = new ArrayList<>();
    }

    public void addConsumer(Consumer consumer) {
        consumers.add(consumer);
        System.out.println("Consumer added successfully.");
    }

    public void removeConsumer(int consumerId) {

        for (int i = 0; i < consumers.size(); i++) {

            if (consumers.get(i).getConsumerId() == consumerId) {
                consumers.remove(i);
                System.out.println("Consumer removed.");
                return;
            }
        }

        System.out.println("Consumer not found.");
    }

    public void generateReport() {

        System.out.println("\n----- CONSUMER REPORT -----");

        for (Consumer c : consumers) {
            System.out.println(
                    "ID: " + c.getConsumerId()
                    + " | Name: " + c.getName()
                    + " | Usage: " + c.getWaterUsage()
                    + " | Bill: Rs." + c.getBillAmount()
            );
        }
    }
}