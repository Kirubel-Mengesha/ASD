package customers;

import java.util.Iterator;

public class SkipIterator implements Iterator<Customer> {
    private Iterator<Customer> iterator;
    private int skip;
    private int count;
    public SkipIterator(Iterator<Customer> iterator, int skip) {
        this.iterator = iterator;
        this.skip = skip;
        this.count = 0;
    }
    @Override
    public boolean hasNext() {
        if (count < skip) {
            count++;
            return iterator.hasNext();
        }
        return false;
    }
    @Override
    public Customer next() {
        if (hasNext()) {
            return iterator.next();
        }
        return null;
    }
}
