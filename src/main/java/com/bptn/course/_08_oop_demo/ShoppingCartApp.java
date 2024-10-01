package com.bptn.course._08_oop_demo;

public class ShoppingCartApp {

	public static void main(String[] args) {
		Product p1 = new Product("P001", "Laptop", 1500, 10);
		Product p2 = new Product("P002", "Smartphone", 500, 20);
		
		Customer customer = new Customer("C001", "TestCustomer", "testemail@gmail.com");
		
		customer.getCart().addProductToCart(p1, 2);
		customer.getCart().addProductToCart(p2, 5);
		
		customer.checkout();
		
		Order order = new Order(customer);
		order.placeOrder();
	}

}
