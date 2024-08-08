package customers.Service.ServiceImpl;

import customers.Domain.Customer;
import customers.Integration.EmailSender;
import customers.Integration.Logger;
import customers.Repository.CustomerDAO;
import customers.Repository.ICustomerDAO;
import customers.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    private  ICustomerDAO customerDAO;
    private  EmailSender emailSender;
    private  Logger logger;

    @Autowired
    public CustomerServiceImpl(ICustomerDAO customerDAO, EmailSender emailSender, Logger logger) {
        this.customerDAO = customerDAO;
        this.emailSender = emailSender;
        this.logger = logger;
    }

    @Override
    public void addCustomer(Customer customer) {
        customerDAO.save(customer);
        emailSender.sendEmail(customer);
        logger.log("Customer added: " + customer.getName());
    }
}
