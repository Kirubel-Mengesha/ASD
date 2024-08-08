package customers.Service.COR;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class IowaCityAsteriskHandler implements CityAsteriskHandler {
    @Override
    public void print() {
        System.out.print("****");
    }

    @Override
    public boolean handle(String city) {
        if(city.equalsIgnoreCase("Iowa City")) {
            print();
            return true;
        }
        return false;
    }
}
