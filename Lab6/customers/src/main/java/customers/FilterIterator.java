package customers;

import java.util.Iterator;
import java.util.function.Predicate;

public class FilterIterator implements Iterator<Customer> {
    private Predicate<Customer> predicate;
    private Iterator<Customer> iterator;
    private Customer nextCustomer;
    public FilterIterator(Iterator<Customer> iterator, Predicate<Customer> predicate) {
        this.iterator = iterator;
        this.predicate = predicate;
        this.nextCustomer = null;
    }
    @Override
    public boolean hasNext() {
        if (nextCustomer != null) {
            return true;
        }
        while (iterator.hasNext()) {
            Customer customer = iterator.next();
            if (predicate.test(customer)) {
                nextCustomer = customer;
                return true;
            }
        }
        return false;
    }
    @Override
    public Customer next() {
        if (nextCustomer != null || hasNext()) {
            Customer customer = nextCustomer;
            nextCustomer = null;
            return customer;
        }
        return null;
    }
}
