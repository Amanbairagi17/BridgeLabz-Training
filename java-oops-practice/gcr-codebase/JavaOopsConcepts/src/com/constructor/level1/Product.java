package com.constructor.level1;

public class Product {
	//Attributes
	private static int totalProducts;
	private String productName;
	private int price;
	
	// constructor
	public Product(String productName, int price) {
		this.productName = productName;
		this.price = price;
		totalProducts++;
	}
	
	// display product details
	public void displayProductDetails() {
		System.out.println(productName + " " + price);
	}
	
	// display total product
	public void displayTotalProducts() {
		System.out.println(totalProducts);
	}
	
	public static void main(String[] args) {
		Product p1 = new Product("Product name1", 100);
		p1.displayProductDetails();
		p1.displayTotalProducts();
		
		Product p2 = new Product("Product name2 ", 400);
		p2.displayProductDetails();
		p2.displayTotalProducts();
	}

}
