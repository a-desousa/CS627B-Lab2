//Group members: Zhifan Wang (25250031), Assia de Sousa (20361001), Yuliia Litvinchuk (25259013)

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Create some sample dates
        LocalDate date1 = LocalDate.parse("2026-07-09");
        LocalDate date2 = LocalDate.parse("2026-03-02");
        LocalDate date3 = LocalDate.parse("2025-12-02");

        // Create passes
        BusPass busPass = new BusPass(1234, "John Smith", date1);
        MetroPass metroPass = new MetroPass(1235, "Jack White", date2);
        BikeSharePass bikeSharePass = new BikeSharePass(1236, "Amy Devlin", date3);

        // Create PassManager and UsageLog
        PassManager manager = new PassManager();
        UsageLog log = new UsageLog();

        // Test calculateFare() for each pass
        double busFare = busPass.calculateFare();
        double metroFare = metroPass.calculateFare();
        double bikeFare = bikeSharePass.calculateFare();

        // Log those usages
        log.log(busPass.getPassID(), "Bus", busFare, LocalDate.now());
        log.log(metroPass.getPassID(), "Metro", metroFare, LocalDate.now());
        log.log(bikeSharePass.getPassID(), "BikeShare", bikeFare, LocalDate.now());

        // Test validation 
        System.out.println("\nChecking validity:");
        System.out.println("Bus pass valid? " + manager.validate(busPass));
        System.out.println("Metro pass valid? " + manager.validate(metroPass));
        System.out.println("Bike pass valid? " + manager.validate(bikeSharePass));

        // Test renew method 
        System.out.println("\nRenewing bike pass by 30 days...");
        manager.renew(bikeSharePass, 30);

        // Print usage log 
        System.out.println("\nAll usage records:");
        log.printAll();
    }
}