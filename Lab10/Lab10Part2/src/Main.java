public class Main {
    public static void main(String[] args) {
        // Create some products
        Product tv = new Product("TV", 300.0);
        Product phone = new Product("Phone", 500.0);

        // Create some orders
        InternalOrder internalOrder = new InternalOrder("2023-01-01", 600.0, "Shipped", "IT");
        internalOrder.addOrderline(new OrderLine(tv, 2));
        internalOrder.addOrderline(new OrderLine(phone, 1));

        IndividualOrder individualOrder = new IndividualOrder("2023-02-01", 900.0, "Shipped", "John Doe");
        individualOrder.addOrderline(new OrderLine(tv, 1));
        individualOrder.addOrderline(new OrderLine(phone, 1));

        CorporateOrder corporateOrder = new CorporateOrder("2023-03-01", 1200.0, "Shipped", "ABC Corp", "Jane Smith");
        corporateOrder.addOrderline(new OrderLine(tv, 3));
        corporateOrder.addOrderline(new OrderLine(phone, 1));

        // Create an order collection
        OrderCollection orderCollection = new OrderCollection();
        orderCollection.addOrder(internalOrder);
        orderCollection.addOrder(individualOrder);
        orderCollection.addOrder(corporateOrder);

        // Test Visitor 1: Count order types
        OrderTypeCounterVisitor orderTypeCounter = new OrderTypeCounterVisitor();
        orderCollection.accept(orderTypeCounter);
        System.out.println("Internal Orders: " + orderTypeCounter.getInternalOrderCount());
        System.out.println("Individual Orders: " + orderTypeCounter.getIndividualOrderCount());
        System.out.println("Corporate Orders: " + orderTypeCounter.getCorporateOrderCount());

        // Test Visitor 2: Calculate total amount
        TotalAmountVisitor totalAmountVisitor = new TotalAmountVisitor();
        orderCollection.accept(totalAmountVisitor);
        System.out.println("Total Amount: " + totalAmountVisitor.getTotalAmount());

        // Test Visitor 3: Count TV orders
        TVOrderCounterVisitor tvOrderCounter = new TVOrderCounterVisitor();
        orderCollection.accept(tvOrderCounter);
        System.out.println("Total TVs Ordered: " + tvOrderCounter.getTvOrderCount());
    }
}
