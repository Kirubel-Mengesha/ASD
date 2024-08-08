package customers.Service.ServiceImpl;

import customers.Domain.Address;
import customers.Domain.Customer;
import customers.Integration.EmailSender;
import customers.Integration.Logger;
import customers.Repository.ICustomerDAO;
import customers.Service.CustomerService;
import customers.Service.COR.CityAsteriskHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    private  ICustomerDAO customerDAO;
    private  EmailSender emailSender;
    private  Logger logger;
    private List<CityAsteriskHandler> asteriskHandlers;

    @Autowired
    public CustomerServiceImpl(ICustomerDAO customerDAO, EmailSender emailSender, Logger logger, List<CityAsteriskHandler> asteriskHandlers) {
        this.customerDAO = customerDAO;
        this.emailSender = emailSender;
        this.logger = logger;
        this.asteriskHandlers = asteriskHandlers;
    }

    @Override
    public void addCustomer(String name, String email, String Street,String city, String zip) {
        Customer customer = new Customer(name, email, new Address(Street, city, zip));
        customerDAO.save(customer);
        emailSender.sendEmail(email, "Welcome " + name + " to Amazon");
        logger.log("Customer added: " + customer.getName());


        asteriskHandlers.stream()
                .anyMatch(asteriskHandler -> asteriskHandler.handle(city));
    }
}
