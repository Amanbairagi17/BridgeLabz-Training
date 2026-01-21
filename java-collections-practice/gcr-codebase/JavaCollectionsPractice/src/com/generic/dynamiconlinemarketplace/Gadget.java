package com.generic.dynamiconlinemarketplace;

public class Gadget extends Product<GadgetCategory> {

    public Gadget(String name, double price, GadgetCategory category) {
        super(name, price, category);
    }

    public double minPrice() {
        return 1000;
    }

    public double maxPrice() {
        return 200000;
    }
}
