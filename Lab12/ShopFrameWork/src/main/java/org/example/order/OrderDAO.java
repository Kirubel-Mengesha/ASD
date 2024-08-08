package org.example.order;

import java.util.HashMap;
import java.util.Map;

public class OrderDAO {
    private Map<Integer, Order> orders = new HashMap<Integer, Order>();

    public void save(Order order){
        orders.put(order.getOrdernumber(), order);
    }
    public Order find(int orderId){
        return orders.get(orderId);
    }
}
