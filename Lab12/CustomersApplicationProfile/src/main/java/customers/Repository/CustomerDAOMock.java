package customers.Repository;

import customers.Domain.Customer;
import customers.Integration.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@Profile("test")
public class CustomerDAOMock implements ICustomerDAO {
    private Map<String, Customer> customerDatabase = new HashMap<>();
    @Autowired
    private Logger logger;


    @Override
    public void save(Customer customer) {
        customerDatabase.put(customer.getEmail(), customer);
        logger.log("--MockDAO--Customer saved: " + customer.getName());
    }
}
