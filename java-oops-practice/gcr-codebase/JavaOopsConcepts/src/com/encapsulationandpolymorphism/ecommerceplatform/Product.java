package com.encapsulationandpolymorphism.ecommerceplatform;

public abstract class Product {
	//field attributes
	private int productId;
	private String name;
	private double price;
	
	//Constructors
	public Product(int productId, String name, double price) {
		this.productId = productId;
		this.name = name;
		this.price = price;
	}
	
	//Getters and Setters
	public int getProductId() {
		return productId;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
	public double calculateTax() {
		return this.price/20;
	}
	//abstract method to calculate
	abstract double calculateDiscount();
}
