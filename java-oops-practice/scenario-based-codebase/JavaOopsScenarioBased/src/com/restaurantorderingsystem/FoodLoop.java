package com.restaurantorderingsystem;

public class FoodLoop {
	public static void main(String[] args) {
		FoodItem f1 = new VegItems("Chili Paneer", "veg", 130, 3);
		FoodItem f2 = new NonVegItems("fish", "Nod-veg", 230, 2);
		
		Order o1 = new Order(f1,f2);
		
		o1.placeOrder();
		
	}
}
