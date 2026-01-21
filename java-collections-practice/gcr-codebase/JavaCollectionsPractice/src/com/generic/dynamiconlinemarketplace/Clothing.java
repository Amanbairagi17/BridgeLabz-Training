package com.generic.dynamiconlinemarketplace;

public class Clothing extends Product<ClothingCategory> {

    public Clothing(String name, double price, ClothingCategory category) {
        super(name, price, category);
    }

    public double minPrice() {
        return 300;
    }

    public double maxPrice() {
        return 5000;
    }
}
