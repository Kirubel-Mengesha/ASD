package Domain;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, CartItem> items;

    public ShoppingCart() {
        items = new HashMap<>();
    }

    public Map<String, CartItem> getItems() {
        return items;
    }

    public void addBook(Book book, int quantity) {
        CartItem item = items.get(book.getIsbn());
        if (item == null) {
            items.put(book.getIsbn(), new CartItem(book, quantity));
        } else {
            item.setQuantity(item.getQuantity() + quantity);
        }
    }

    public void removeBook(String isbn) {
        items.remove(isbn);
    }

    public void changeQuantity(String isbn, int quantity) {
        CartItem item = items.get(isbn);
        if (item != null) {
            item.setQuantity(quantity);
        }
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "items=" + items +
                '}';
    }
}
