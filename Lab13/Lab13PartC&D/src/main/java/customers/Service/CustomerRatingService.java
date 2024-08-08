package customers.Service;

import customers.Domain.CustomerEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class CustomerRatingService {
    @EventListener
    public void handleCustomerEvent(CustomerEvent event) {
        System.out.println("Received customer event: " + event.getMessage());
    }
}

