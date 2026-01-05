package com.swiftcart;

public class NonPerishableProduct extends Product {

    public NonPerishableProduct(String name, double price) {
        super(name, price, "Non-Perishable");
    }

  //Overridden method to calculating discount for nonperishable product
    public double getDiscount(double total) {
        return total * 0.05;   // 5% discount
    }
}

