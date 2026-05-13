package watermanagment;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        WaterSystem system = new WaterSystem(100000);

        Admin admin = new Admin(1, "Admin", "admin123");

        Operator operator = new Operator(101, "Rahul", "Zone A", "6 AM - 6 PM");

        ArrayList<Consumer> consumers = new ArrayList<>();

        System.out.print("Enter number of consumers: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details for Consumer " + (i + 1));

            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            

            Consumer c = new Consumer(id, name);

            consumers.add(c);
            admin.addConsumer(c);
        }

        Consumer activeConsumer = consumers.get(0);

        int choice;

        do {
            System.out.println("\n===== WATER SUPPLY MANAGEMENT SYSTEM =====");

            System.out.println("1. Use Water");
            System.out.println("2. View Usage");
            System.out.println("3. Pay Bill");
            System.out.println("4. Report Leakage");
            System.out.println("5. Control Supply");
            System.out.println("6. Update Schedule");
            System.out.println("7. Monitor Flow");
            System.out.println("8. Stop Supply");
            System.out.println("9. Generate Report");
            System.out.println("10. Detect Leakage");
            System.out.println("11. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter litres used: ");
                    double litres = sc.nextDouble();

                    activeConsumer.useWater(litres);
                    system.trackUsage(activeConsumer);
                    break;

                case 2:
                    activeConsumer.viewUsage();
                    break;

                case 3:
                    activeConsumer.payBill();
                    break;

                case 4:
                    activeConsumer.reportLeakage(system);
                    system.sendAlert("Leakage complaint registered.");
                    break;

                case 5:
                    operator.controlSupply();
                    break;

                case 6:
                    sc.nextLine();
                    System.out.print("Enter new schedule: ");
                    String schedule = sc.nextLine();
                    operator.updateSchedule(schedule);
                    break;

                case 7:
                    operator.monitorFlow();
                    break;

                case 8:
                    operator.stopSupply();
                    break;

                case 9:
                    admin.generateReport();
                    system.generateConsumptionReport();
                    break;

                case 10:
                    system.detectLeakage();
                    break;

                case 11:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 11);

        sc.close();
    }
}