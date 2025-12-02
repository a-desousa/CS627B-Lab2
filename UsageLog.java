//Group members: Zhifan Wang (25250031), Assia de Sousa (20361001), Yuliia Litvinchuk (25259013)

import java.time.LocalDate;
import java.util.*;
public class UsageLog {
  // use ArrayList to include all the records 
    private ArrayList<String> records = new ArrayList<>();

    // log a record
    public void log(int passId, String transportType, double fare, LocalDate date) {
        String record = "Pass: " + passId + "; Type: " + transportType + "; Fare: " + fare + "; Date: " + date;
        records.add(record);
    }

    // print all the records
    public void printAll() {
        for (String record : records) {
            System.out.println(record);
        }
    }
}