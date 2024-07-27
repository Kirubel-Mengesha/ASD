package counter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Subject {
    private Collection<IObserver> observerlist = new ArrayList<IObserver>();

    public void addObserver(IObserver observer){
        observerlist.add(observer);
    }

    public void donotify(int countervalue){
        Iterator<IObserver> iterator = observerlist.iterator();
        while(iterator.hasNext()){
            IObserver observer = iterator.next();
            observer.update(countervalue);
        }
    }
}
