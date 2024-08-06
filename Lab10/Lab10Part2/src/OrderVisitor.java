public interface OrderVisitor {
    void visit(InternalOrder order);
    void visit(IndividualOrder order);
    void visit(CorporateOrder order);
}
