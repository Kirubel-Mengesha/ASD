package customers.Service.COR;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(Integer.MAX_VALUE)
public class DefaultAsteriskHandler implements CityAsteriskHandler {
    @Override
    public void print() {
        System.out.print("**********");
    }

    @Override
    public boolean handle(String city) {
        print();
        return true;
    }
}
