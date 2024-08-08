package customers.Integration;

import customers.Domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmailSender {
    Logger logger;

    @Autowired
    public EmailSender(Logger logger) {
        this.logger = logger;
    }

    public void sendEmail(String email, String message){
        System.out.println("Email sent to: " + email + " with Message=" + message);
        logger.log("Email sent to: " + email + " with Message=" + message);
    }
}
