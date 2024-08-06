public class InternalOrder extends Order{
    private String department;

    public InternalOrder(String date, double amount, String state, String department) {
        super(date, amount, state);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void accept(OrderVisitor visitor) {
        visitor.visit(this);
    }
}
