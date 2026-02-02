package com.lambdaexpression.ecommerce;

public class Product {
	String name;
	double rating;
	double price;
	double discount;
	
	public Product(String name, double rating, double price, double discount) {
		super();
		this.name = name;
		this.rating = rating;
		this.price = price;
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", rating=" + rating + ", price=" + price + ", discount=" + discount + "]";
	}
	
	
	
}
