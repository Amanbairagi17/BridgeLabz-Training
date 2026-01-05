package com.swiftcart;

public class GroceryApplication {
	 public static void main(String[] args) {

	        Product milk = new PerishableProduct("Milk", 50);
	        Product rice = new NonPerishableProduct("Rice", 60);

	        Cart cart = new Cart();
	        cart.addItem(milk, 2);   // 50 × 2
	        cart.addItem(rice, 5);   // 60 × 5

	        cart.generateBill();
	    }
}
