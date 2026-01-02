package com.encapsulationandpolymorphism.ecommerceplatform;

public class Clothing extends Product{
	private String brandName;

	public Clothing(int id, String name, double price, String brandName) {
		super(id, name, price);
		this.brandName = brandName;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	@Override
	public double calculateDiscount() {
		double discount = super.getPrice() * 0.20;
		return discount;
		
	}
	

}
