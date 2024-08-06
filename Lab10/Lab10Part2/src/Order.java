import java.util.ArrayList;
import java.util.List;

public abstract class Order {
    private String date;
    private double amount;
    private String state;
    private List<OrderLine> orderlines;

    public Order(String date, double amount, String state) {
        this.date = date;
        this.amount = amount;
        this.state = state;
        this.orderlines = new ArrayList<>();
    }

    public List<OrderLine> getOrderlines() {
        return orderlines;
    }

    public double getAmount() {
        return amount;
    }
    public void addOrderline(OrderLine orderline) {
        orderlines.add(orderline);
    }

    public abstract void accept(OrderVisitor visitor);
}
