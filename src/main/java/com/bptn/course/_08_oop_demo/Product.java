package com.bptn.course._08_oop_demo;

class Product {
	private String productId;
	private String productName;
	private double productPrice;
	private int productQuantitiy;
	
	public Product(String productId, String productName, double productPrice, int productQuantitiy) {
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productQuantitiy = productQuantitiy;
	}

	public String getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public int getProductQuantitiy() {
		return productQuantitiy;
	}

	public void reduceStock(int quantity) {
		if(quantity <= this.productQuantitiy) {
			this.productQuantitiy -= quantity;
		}else {
			throw new IllegalArgumentException("Insufficient Stock!");
		}
	}
	
}
