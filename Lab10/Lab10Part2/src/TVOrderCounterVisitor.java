public class TVOrderCounterVisitor implements OrderVisitor {
    private int tvOrderCount = 0;

    public int getTvOrderCount() {
        return tvOrderCount;
    }

    @Override
    public void visit(InternalOrder order) {
        countTVs(order);
    }

    @Override
    public void visit(IndividualOrder order) {
        countTVs(order);
    }

    @Override
    public void visit(CorporateOrder order) {
        countTVs(order);
    }

    private void countTVs(Order order) {
        for (OrderLine orderline : order.getOrderlines()) {
            if (orderline.getProduct().getName().equalsIgnoreCase("TV")) {
                tvOrderCount += orderline.getQuantity();
            }
        }
    }
}
