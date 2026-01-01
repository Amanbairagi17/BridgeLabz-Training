package com.objectmodelling.level1.ecommerceplatform;

public class Product {
	//Attribute
	private String id;
    private String name;
    private double price;

    // constructor
    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // getter and setter
    public double getPrice() {
        return price;
    }

    public String getProductName() {
        return name;
    }

    public void showProduct() {
        System.out.println(name + " " + price);
    }
}
