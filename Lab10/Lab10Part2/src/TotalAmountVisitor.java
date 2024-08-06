public class TotalAmountVisitor implements OrderVisitor {
    private double totalAmount = 0;

    public double getTotalAmount() {
        return totalAmount;
    }

    @Override
    public void visit(InternalOrder order) {
        totalAmount += order.getAmount();
    }

    @Override
    public void visit(IndividualOrder order) {
        totalAmount += order.getAmount();
    }

    @Override
    public void visit(CorporateOrder order) {
        totalAmount += order.getAmount();
    }
}
