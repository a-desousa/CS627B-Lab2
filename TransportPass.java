//Group members: Zhifan Wang (25250031), Assia de Sousa (20361001), Yuliia Litvinchuk (25259013)

import java.time.LocalDate;

public abstract class TransportPass {
  //attributes
  private int passID;
  private String ownerName;
  private LocalDate validUntil;

  //constructor
  public TransportPass (int passID, String ownerName, LocalDate validUntil) {
    this.passID= passID;
    this.ownerName= ownerName;
    this.validUntil = validUntil; 
  }

  //getter methods
  public int getPassID() {
    return passID;
  }

  public String getOwnerName() {
    return ownerName;
  }

  public LocalDate getValidUntil() {
    return validUntil;
  }

  public void setPassID(int passID) {
    this.passID = passID;
  }

  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }

  public void setValidUntil(LocalDate validUntil) {
    this.validUntil = validUntil;
  }


  public abstract double calculateFare();
}
