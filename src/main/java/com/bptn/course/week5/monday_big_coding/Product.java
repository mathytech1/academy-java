package com.bptn.course.week5.monday_big_coding;

import java.util.ArrayList;
import java.util.List;

public class Product {

	// Instance variables to hold the product's id, name, and price
	int id;
	String name;
	double price;

	// Constructor to initialize the product properties
	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	// Static method to count the number of products with a price less than 30000
	static long countProducts(List<Product> productsList) {
		// Use a stream to filter the products by price and get the count of those under
		// 30000
		// stream() will convert our list productList into the stream,
		// filter() will filter the products with the price greater than 30000
		// count() will count the number of products generated from filter ant return
		// the value
		long count = productsList.stream().filter(product -> product.price < 30000).count();
		return count;
	}

	public static void main(String[] args) {
		// Create a list to hold multiple Product objects
		List<Product> productsList = new ArrayList<>();

		// Add some Product instances with different prices
		productsList.add(new Product(1, "HP Laptop", 25000));
		productsList.add(new Product(2, "Dell Laptop", 30000));
		productsList.add(new Product(3, "Lenovo Laptop", 28000));
		productsList.add(new Product(4, "Sony Laptop", 28000));
		productsList.add(new Product(5, "Apple Laptop", 90000));

		// Call the countProducts method and store the result
		long count = countProducts(productsList);

		// Print the number of products whose price is less than 30000
		System.out.println("Number of products with price less than 30000: " + count);
	}
}

/*
 * Summary: For this task, I mainly focused on creating the `countProducts`
 * method and adding code to test it in the main method. I used Java streams to
 * filter the list of products based on price and count how many products were
 * priced below 30000. The stream API made it simple to write clean, concise
 * code for this operation.
 * 
 * I didn't run into major issues with the implementation, but I had to be
 * mindful of how to use streams correctly. The main takeaway for me is how
 * useful the stream API is for filtering and processing data in lists, and I'll
 * definitely use this approach for similar tasks in the future.
 */
