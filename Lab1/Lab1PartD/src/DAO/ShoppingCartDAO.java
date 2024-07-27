package DAO;

import Domain.ShoppingCart;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCartDAO {
    private Map<String, ShoppingCart> database;

    public ShoppingCartDAO() {
        database = new HashMap<>();
    }

    public void save(String customerId, ShoppingCart cart) {
        database.put(customerId, cart);
    }
    public void delete(String customerId) {
        database.remove(customerId);
    }

    public void update(String customerId, ShoppingCart cart) {
        database.put(customerId, cart);
    }

    public ShoppingCart find(String customerId) {
        return database.get(customerId);
    }

}
