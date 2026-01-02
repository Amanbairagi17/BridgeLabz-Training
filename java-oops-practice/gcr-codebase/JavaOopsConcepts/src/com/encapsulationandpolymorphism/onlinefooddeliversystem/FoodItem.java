package com.encapsulationandpolymorphism.onlinefooddeliversystem;

public abstract class FoodItem implements Discountable{
	//attributes
	private String itemName;
	private double price;
	private int quantity;
	
	//constructor
	public FoodItem(String itemName, double price, int quantity) {
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}
	
	public abstract int calculateTotalPrice();

    // concrete method
    public void getItemDetails() {
        System.out.println(itemName + " Price : " + price + " Quantity : " + quantity);
    }
	
	//getters and setters
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
