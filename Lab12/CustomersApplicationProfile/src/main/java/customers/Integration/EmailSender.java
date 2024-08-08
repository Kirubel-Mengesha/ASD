package customers.Integration;

import customers.Domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmailSender {
    @Autowired
    private Logger logger;

    public void sendEmail(Customer customer) {
        logger.log("Email sent to: " + customer.getEmail());
    }
}
