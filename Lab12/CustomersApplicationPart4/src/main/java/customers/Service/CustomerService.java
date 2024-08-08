package customers.Service;

import customers.Domain.Customer;

public interface CustomerService {
    public void addCustomer(String name, String email, String Street,String city, String zip);
}
