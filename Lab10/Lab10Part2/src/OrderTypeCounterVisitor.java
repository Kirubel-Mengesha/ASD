public class OrderTypeCounterVisitor implements OrderVisitor {
    private int internalOrderCount = 0;
    private int individualOrderCount = 0;
    private int corporateOrderCount = 0;



    public int getInternalOrderCount() {
        return internalOrderCount;
    }

    public int getIndividualOrderCount() {
        return individualOrderCount;
    }

    public int getCorporateOrderCount() {
        return corporateOrderCount;
    }

    @Override
    public void visit(InternalOrder order) {
        internalOrderCount++;
    }

    @Override
    public void visit(IndividualOrder order) {
        individualOrderCount++;
    }

    @Override
    public void visit(CorporateOrder order) {
        corporateOrderCount++;
    }
}
