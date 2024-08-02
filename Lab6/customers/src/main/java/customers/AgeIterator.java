package customers;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class AgeIterator implements Iterator<Customer> {
   private Iterator<Customer> iterator;

    public AgeIterator(List<Customer> customerAgeList) {
        customerAgeList.sort(Comparator.comparingInt(Customer::getAge));
        this.iterator = customerAgeList.iterator();
   }
   public Iterator<Customer> iterator() {
      return this.iterator;
   }
   @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }
    @Override
    public Customer next() {
        return iterator.next();
    }


}
