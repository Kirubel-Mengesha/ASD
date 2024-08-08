package customers.Repository;

import customers.Domain.Customer;

public interface ICustomerDAO {
    public void save(Customer customer);
}
