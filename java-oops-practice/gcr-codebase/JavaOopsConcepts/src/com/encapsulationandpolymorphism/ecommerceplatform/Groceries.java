package com.encapsulationandpolymorphism.ecommerceplatform;

public class Groceries extends Product{

	public Groceries(int productId, String name, double price) {
		super(productId, name, price);
	}
	
	public double calculateDiscount() {
		double discount = super.getPrice() * 0.05;
		return discount;
		
	}
	
	
}
