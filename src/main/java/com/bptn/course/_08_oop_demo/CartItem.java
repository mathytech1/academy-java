package com.bptn.course._08_oop_demo;

class CartItem {
	private Product product;
	private int cartQuantity;
	public CartItem(Product product, int quantity) {
		if(quantity > product.getProductQuantitiy()) {
			throw new IllegalArgumentException("Insufficient Stock");
		}
		this.product = product;
		this.cartQuantity = quantity;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getCartQuantity() {
		return cartQuantity;
	}
	public void setCartQuantity(int cartQuantity) {
		this.cartQuantity = cartQuantity;
	}
	
	public double getTotalPrice() {
		return product.getProductPrice() * this.cartQuantity;
	}
	
	
	
}
