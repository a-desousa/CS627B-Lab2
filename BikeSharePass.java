//Group members: Zhifan Wang (25250031), Assia de Sousa (20361001), Yuliia Litvinchuk (25259013)

import java.time.LocalDate;
// BikeSharePass is a subclass of TransportPass, representing a specific type of transit pass
public class BikeSharePass extends TransportPass{
    // Constructor
    public BikeSharePass(int passID, String ownerName, LocalDate validUntil) {
        super(passID, ownerName, validUntil);
    }
    // Overrides the abstract method calculateFare() from TransportPass
    @Override
    public double calculateFare() {
        double fare = 4.50;
        System.out.println("Bike share fare for " + getOwnerName() + " is €" + fare);
        return fare;
    }
}