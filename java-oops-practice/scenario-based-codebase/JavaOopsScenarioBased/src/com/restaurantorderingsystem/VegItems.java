package com.restaurantorderingsystem;

public class VegItems extends FoodItem{
	public VegItems(String name, String category, double price, int stock) {
		super(name, category, price, stock);
	}
	
	public boolean isVeg() {
		return true;
	}

}
