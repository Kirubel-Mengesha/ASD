package customers;

import customers.Domain.Address;
import customers.Domain.Customer;
import customers.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomersApplication implements CommandLineRunner {
	@Autowired
	private CustomerService customerService;

	public static void main(String[] args) {
		SpringApplication.run(CustomersApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Address address = new Address("123 Baker St", "London","112");
		Customer customer = new Customer("Frank Brown", "Franko@gmail.com");
		customer.setAddress(address);

		customerService.addCustomer(customer);
	}
}
