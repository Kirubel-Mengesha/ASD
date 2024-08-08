package customers.Service;

import customers.Domain.Address;
import customers.Domain.Customer;
import customers.Domain.CustomerEvent;
import customers.Repository.ICustomerDAO;
import customers.integration.IEmailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService {
	@Autowired
	ICustomerDAO customerDAO;
	@Autowired
	IEmailSender emailSender;
	@Autowired
	private ApplicationEventPublisher publisher;
	@Autowired
	private Configure configure;

	public void addCustomer(String name, String email, String street, String city, String zip) {
		Customer customer = new Customer(name, email);
		Address address = new Address(street, city, zip);
		customer.setAddress(address);
		customerDAO.save(customer);
		emailSender.sendEmail(email, "Welcome " + name + " as a new customer");
		publisher.publishEvent(new CustomerEvent("Customer is saved in the DB: " + customer));

		System.out.println("Application Name: " + configure.getApplicationName());
		System.out.println("Version: " + configure.getVersion());
		System.out.println("Server URL: " + configure.getServerURL());
		System.out.println("Server Name: " + configure.getServerName());
		System.out.println();
		System.out.println("Countries: " + configure.getCountries());
		System.out.println();
		System.out.println("first name: " + configure.getUser().getFirstName());
		System.out.println("last name: " + configure.getUser().getLastName());
		System.out.println("username: " + configure.getUser().getUsername());
		System.out.println("password: " + configure.getUser().getPassword());

	}

	public void setCustomerDAO(ICustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}

	public void setEmailSender(IEmailSender emailSender) {
		this.emailSender = emailSender;
	}




}
