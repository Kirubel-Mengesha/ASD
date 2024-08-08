package customers.Repository;

import customers.Domain.Customer;
import customers.integration.ILogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;


@Repository
@Profile("Production")
public class CustomerDAO implements ICustomerDAO{
	@Autowired
	private ILogger logger;
	
	public void save(Customer customer) {
		// simple sleep
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("CustomerDAO: saving customer "+customer.getName());
		logger.log("Customer is saved in the DB: "+ customer.getName() );
	}

	public void setLogger(ILogger logger) {
		this.logger = logger;
	}
	
}
