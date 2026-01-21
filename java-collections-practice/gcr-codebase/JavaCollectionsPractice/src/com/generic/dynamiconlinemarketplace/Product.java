package com.generic.dynamiconlinemarketplace;

abstract class Product<T> {

    private String name;
    private double price;
    private T category;

    //constructor
    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    //getters and setters
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public T getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public abstract double minPrice();
    public abstract double maxPrice();

    @Override
    public String toString() {
        return name +
                " | Category: " + category +
                " | Price: ₹" + price;
    }
}
