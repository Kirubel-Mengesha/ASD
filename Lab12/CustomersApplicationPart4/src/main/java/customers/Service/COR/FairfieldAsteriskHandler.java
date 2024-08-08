package customers.Service.COR;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class FairfieldAsteriskHandler implements CityAsteriskHandler {
    @Override
    public void print() {
        System.out.print("***");
    }
    @Override
    public boolean handle(String city) {
        if ("Fairfield".equalsIgnoreCase(city)) {
            print();
            return true;
        }
        return false;
    }
}
