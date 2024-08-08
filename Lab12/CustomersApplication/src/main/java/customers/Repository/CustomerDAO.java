package customers.Repository;

import customers.Domain.Customer;
import customers.Integration.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;


@Component
public class CustomerDAO implements ICustomerDAO{
    private Map<String, Customer> customerDatabase = new HashMap<>();
    @Autowired
    private Logger logger;


    @Override
    public void save(Customer customer) {
        customerDatabase.put(customer.getEmail(), customer);
        logger.log("Customer saved: " + customer.getName());
    }
}
