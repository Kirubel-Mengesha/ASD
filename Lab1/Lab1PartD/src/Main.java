import DAO.ShoppingCartDAO;
import Domain.Book;
import Domain.Customer;
import Domain.ShoppingCart;

public class Main {
    public static void main(String[] args) {

        // Create customers
        Customer customer1 = new Customer("1", "John Doe");
        Customer customer2 = new Customer("2", "Jane Smith");

        // Create books
        Book book1 = new Book("123", "Alexander", "A Pattern Language", 75.3);
        Book book2 = new Book("456", "Erick Gamma", "Gang Of Four", 155.1);

        // Create a shopping cart and add books to it
        ShoppingCart cart = new ShoppingCart();
        cart.addBook(book1, 2);
        cart.addBook(book2, 1);

        // Create another shopping cart and add books to it
        ShoppingCart cart2 = new ShoppingCart();
        cart2.addBook(book1, 1);
        cart2.addBook(book2, 3);


        // Create ShoppingCartDAO and save the carts
        ShoppingCartDAO dao = new ShoppingCartDAO();
        dao.save(customer1.getId(), cart);
        dao.save(customer2.getId(), cart2);

        // Retrieve and print the shopping cart for customer1
        ShoppingCart retrievedCart = dao.find(customer1.getId());
        System.out.println("Shopping cart for " + customer1.getName() + ": " + retrievedCart);
        System.out.println("-".repeat(250));

        // Change quantity of a book in the cart for customer1
        cart.changeQuantity("123", 5);
        dao.update(customer1.getId(), cart);

        // Retrieve and print the updated shopping cart for customer1
        ShoppingCart updatedCart1 = dao.find(customer1.getId());
        System.out.println("Updated shopping cart for " + customer1.getName() + ": " + updatedCart1);
        System.out.println("-".repeat(250));

        // Remove a book from the cart for customer1
        cart.removeBook("456");
        dao.update(customer1.getId(), cart);

        // Retrieve and print the updated shopping cart for customer1
        ShoppingCart finalCart1 = dao.find(customer1.getId());
        System.out.println("Final shopping cart for " + customer1.getName() + ": " + finalCart1);
        System.out.println("-".repeat(250));

        // Retrieve and print the shopping cart for customer2
        ShoppingCart retrievedCart2 = dao.find(customer2.getId());
        System.out.println("Shopping cart for " + customer2.getName() + ": " + retrievedCart2);
    }
}