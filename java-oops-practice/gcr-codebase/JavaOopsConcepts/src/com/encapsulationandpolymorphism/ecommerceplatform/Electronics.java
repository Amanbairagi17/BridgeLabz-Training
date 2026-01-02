package com.encapsulationandpolymorphism.ecommerceplatform;

public class Electronics extends Product{
	private String itemName;

	public Electronics(int productId, String name, double price, String itemName) {
		super(productId, name, price);
		this.itemName = itemName;
	}
	
	@Override
	public double calculateDiscount() {
		double discount = super.getPrice() * 0.02;
		return discount;
		
	}
	
}
