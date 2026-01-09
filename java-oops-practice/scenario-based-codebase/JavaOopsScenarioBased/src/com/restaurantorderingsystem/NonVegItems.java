package com.restaurantorderingsystem;

public class NonVegItems extends FoodItem{
	public NonVegItems(String name, String category, double price, int stock) {
		super(name, category, price, stock);
	}
	
	@Override
	public boolean isVeg() {
		return false;
	}

}
