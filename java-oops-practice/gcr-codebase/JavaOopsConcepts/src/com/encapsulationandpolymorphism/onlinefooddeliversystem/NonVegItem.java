package com.encapsulationandpolymorphism.onlinefooddeliversystem;

public class NonVegItem extends FoodItem{
	// constructor
    public NonVegItem(String itemName, int price, int quantity) {
        super(itemName, price, quantity);
    }

    public int calculateTotalPrice() {
        return (int) (getPrice() * getQuantity()) + 100;
    }

    public int applyDiscount() {
        return 10;
    }

    public void getDiscountDetails() {
        System.out.println("Non-veg item discount : 10");
    }
}
