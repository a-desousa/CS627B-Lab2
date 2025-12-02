//Group members: Zhifan Wang (25250031), Assia de Sousa (20361001), Yuliia Litvinchuk (25259013)

import java.time.LocalDate;

// MetroPass is a subclass of TransportPass, representing a specific type of transit pass
public class MetroPass extends TransportPass{
    //Constructor
    public MetroPass(int passID, String ownerName, LocalDate validUntil) {
        super(passID, ownerName, validUntil);
    }
    // Overrides the abstract method calculateFare() from TransportPass
    public double calculateFare() {
        double fare = 5.50;
        System.out.println("Metro pass fare for " + getOwnerName() + " is €" + fare);
        return fare;
    }
}