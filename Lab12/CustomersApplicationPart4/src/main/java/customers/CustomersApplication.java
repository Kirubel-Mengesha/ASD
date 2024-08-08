package customers;

import customers.Domain.Address;
import customers.Domain.Customer;
import customers.Service.COR.*;
import customers.Service.CustomerService;
import customers.Service.ServiceImpl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class CustomersApplication implements CommandLineRunner {
	@Autowired
	private CustomerService customerService;

	public static void main(String[] args) {
		SpringApplication.run(CustomersApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		customerService.addCustomer("Kirubel","kirasolo@gmail.com","1000 N 4th St","Fairfield","52557");
	}
}
