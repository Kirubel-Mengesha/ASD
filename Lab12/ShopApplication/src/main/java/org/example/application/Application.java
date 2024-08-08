package org.example.application;


import org.example.order.*;
import org.example.products.*;
import org.example.shopping.*;

public class Application {

	public static void main(String[] args) {
		ProductService productService = new ProductService();
		productService.addProduct(123,"Product1",25.50);
		productService.addProduct(124,"Product2",20.50);
		productService.addProduct(125,"Product3",13.75);
		
		Product product1 = productService.getProduct(123);
		Product product2 = productService.getProduct(124);
		ShoppingService shoppingService = new ShoppingService();
		shoppingService.createCart(1);
		shoppingService.addToCart(1, product1,4);
		shoppingService.addToCart(1, product2,2);
		shoppingService.changeQuantity(1,124,5);

		ShoppingCart cart = shoppingService.getCart(1);
		System.out.println(cart);

		OrderService orderService = new OrderService();
		orderService.createOrder(cart, 1);

		Order order= orderService.getOrder(1);
//		order.setOrdernumber("ORD3429");
		order.setCustomer(new Customer("Jadon Sancho","JadonSancho@gmail.com","434-768-9000"));
		order.setBillingAddress(new InternationalAddress("1000 N 4th", "London", "12345", "England"));
		order.setShippingAddress(new InternationalAddress("1000 N 5th", "London", "12346", "England"));
		Payment payment = new Payment(300.00, "12/07/2023");
		payment.setPaymentType(new PayPalPayment("sanchozgreat.com"));
		order.setPayment(payment);
		orderService.saveOrder(order);

		System.out.println(order);

		orderService.placeOrder(1);


	}

}
