package com.pharmacyinventorysystem;

import java.time.LocalDate;

public abstract class Medicine implements ISellable {

    protected LocalDate expiryDate;
    private String name;
    private double price;
    private int quantity;

    public Medicine(String name, double price, LocalDate expiryDate) {
        this(name, price, expiryDate, 100);
    }

    public Medicine(String name, double price, LocalDate expiryDate, int quantity) {
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
        this.quantity = quantity;
    }

    @Override
    public double sell(int units) {

        if (checkExpiry(expiryDate)) {   // polymorphic call
            System.out.println("Medicine expired");
        }

        if (units > quantity) {
        	System.out.println("Insufficient stock");
        }

        quantity -= units;

        double total = price * units;
        return applyDiscount(total);
    }

    private double applyDiscount(double total) {
        if (total > 1000) return total * 0.9;
        return total;
    }
}
