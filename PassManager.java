//Group members: Zhifan Wang (25250031), Assia de Sousa (20361001), Yuliia Litvinchuk (25259013)

import java.time.LocalDate;

public class PassManager {
    // check whether the pass is still valid
    public boolean validate(TransportPass pass) {
        LocalDate today = LocalDate.now();
        if (today.isBefore(pass.getValidUntil()) ) {
            return true;
        } 
        return false;
    }

    // renew the pass by extending valid days
    public void renew(TransportPass pass, int days) {
        pass.setValidUntil(pass.getValidUntil().plusDays(days));
        System.out.println("Pass renewed until: " + pass.getValidUntil());
    }
}