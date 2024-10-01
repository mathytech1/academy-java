package com.bptn.course._08_oop_demo;

class ShoppingCart {
	private CartItem[] items;
	private int itemCount;
	
	public ShoppingCart() {
		items = new CartItem[5];
		this.itemCount = 0;
	}
	
	// addProductToCart
	public void addProductToCart(Product product, int quantity) {
		CartItem newItem = new CartItem(product, quantity);
		items[itemCount] = newItem;
		itemCount++;
		product.reduceStock(quantity);
	}
	
	// showProuctsInCart
	public CartItem[] showProuctsInCart() {
		CartItem[] currentItems = new CartItem[itemCount];
		for(int i=0; i<itemCount; i++) {
			currentItems[i] = items[i];
		}
		return currentItems;
		
		/*
		 * for(int i=0; i<itemCount; i++) {
		 * System.out.println(items[i].getProduct().getProductId() + ": " +
		 * items[i].getProduct().getProductName() + " " +
		 * items[i].getProduct().getProductPrice() + " " +
		 * items[i].getProduct().getProductQuantitiy() + " " +
		 * items[i].getCartQuantity() + items[i].getTotalPrice()); }
		 */
	}
}
