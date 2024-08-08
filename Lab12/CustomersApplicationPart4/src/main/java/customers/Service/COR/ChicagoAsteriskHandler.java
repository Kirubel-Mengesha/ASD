package customers.Service.COR;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class ChicagoAsteriskHandler implements CityAsteriskHandler {

    @Override
    public void print() {
        System.out.print("**");
    }
    @Override
    public boolean handle(String city) {
        if(city.equalsIgnoreCase("Chicago")) {
            print();
            return true;
        }
        return false;
    }
}
