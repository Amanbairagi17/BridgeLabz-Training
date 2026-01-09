package com.restaurantorderingsystem;


public abstract class FoodItem {
	private String name;
	private String category;
	private double price;
	private int stock;
	
	//constructor to intialising values
	public FoodItem(String name, String category, double price, int stock) {
		this.name = name;
		this.category = category;
		this.price = price;
		this.stock = stock;
	}
	
	public double getPrice() {
		 return price;
	}
	
	public boolean isAvailable() {
		return stock > 0;
	}
	
	protected void reduceStock() {
        if (stock <= 0) {
            throw new IllegalStateException("Item out of stock");
        }
        stock--;
    }
	public abstract boolean isVeg();
	
}
