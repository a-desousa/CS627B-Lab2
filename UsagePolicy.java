//Group members: Zhifan Wang (25250031), Assia de Sousa (20361001), Yuliia Litvinchuk (25259013)

import java.util.*;

public class UsagePolicy {
  // Use ArrayList for peakHours and zones because each can contain one or multiple values
  private ArrayList<String> peakHours;    
  private ArrayList<String> zones;        
  private int limits;            

  // Constructor with parameters to initialize all fields
  public UsagePolicy(ArrayList<String> peakHours,  ArrayList<String> zones, int limits) {
    this.peakHours = peakHours;
    this.zones = zones;
    this.limits = limits;
  }

  //Getter and setter methods below
  public ArrayList<String> getPeakHours() {
    return peakHours;
  }

  public void setPeakHours(ArrayList<String> peakHours) {
    this.peakHours = peakHours;
  }

  public ArrayList<String> getZones() {
    return zones;
  }

  public void setZones(ArrayList<String> zones) {
    this.zones = zones;
  }

  public int getLimits() {
    return limits;
  }

  public void setLimits(int limits) {
    this.limits = limits;
  }
   
}