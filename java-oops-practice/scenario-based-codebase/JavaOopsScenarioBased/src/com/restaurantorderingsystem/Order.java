package com.restaurantorderingsystem;

import java.util.ArrayList;
import java.util.List;

public class Order implements IOrderable{
	private double total;
	private List<FoodItem> items;
	
	public Order(FoodItem...foodItems ) {
		items = new ArrayList<FoodItem>();
		for(FoodItem foodItem : foodItems) {
			if(!foodItem.isAvailable()) {
				throw new RuntimeException("Itmes out of stock");
			}
			this.items.add(foodItem);
			total += foodItem.getPrice();
		}
	}
	
	 @Override
	    public void placeOrder() {
	        for (FoodItem item : items) {
	            item.reduceStock();
	        }

	        double discount = applyDiscount();
	        total -= discount;

	        System.out.println("Order placed successfully!");
	        System.out.println("Final amount: " + total);
	    }

	public void cancelOrder() {
		System.out.println("Order cancelled !!!!");
	}
	
	protected double applyDiscount() {
		if(this.total < 1200) return total * 0.15;
		if(this.total < 2000) return this.total * 0.15;
		return total * 0.20;
	}
}
