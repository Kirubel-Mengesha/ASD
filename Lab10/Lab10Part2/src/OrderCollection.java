import java.util.ArrayList;
import java.util.List;

public class OrderCollection {
    private List<Order> orders;

    public OrderCollection() {
        this.orders = new ArrayList<>();
    }
    public void addOrder(Order order) {
        orders.add(order);
    }

    public void accept(OrderVisitor visitor) {
        for (Order order : orders) {
            order.accept(visitor);
        }
    }
}
