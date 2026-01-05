package com.swiftcart;

public abstract class Product {
    private String name;
    private String category;
    private double price;   // protected → visible to subclasses only

    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    // Polymorphic discount
    public abstract double getDiscount(double total);

    //getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

    
}

