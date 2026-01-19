package com.productsortingbydiscount;

public class Product {
	private String name;
	private int discount;
	
	//constructor
	public Product(String name, int discount) {
		super();
		this.name = name;
		this.discount = discount;
	}

	//getters
	public String getProductName() {
		return name;
	}

	public int getDiscount() {
		return discount;
	}

	@Override
	public String toString() {
		return "Product [name : " + name + ", discount : " + discount + "]";
	}	
	
	
}