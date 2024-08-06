public class IndividualOrder extends Order{
    private String name;

    public IndividualOrder(String date, double amount, String state, String name) {
        super(date, amount, state);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void accept(OrderVisitor visitor) {
        visitor.visit(this);
    }
}
