package com.encapsulationandpolymorphism.onlinefooddeliversystem;

public class VegItem extends FoodItem{

	public VegItem(String itemName, double price, int quantity) {
		super(itemName, price, quantity);
	}

	public int calculateTotalPrice() {
        return (int) super.getPrice() * super.getQuantity();
    }

    public int applyDiscount() {
        return 100;
    }

    public void getDiscountDetails() {
        System.out.println("Veg item discount : 100");
    }

}
