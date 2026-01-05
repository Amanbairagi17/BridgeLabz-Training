package com.swiftcart;

public class PerishableProduct extends Product {

    public PerishableProduct(String name, double price) {
        super(name, price, "Perishable");
    }

    //Overridden method to calculating discount for perishable product
    public double getDiscount(double total) {
        return total * 0.10;   // 10% discount
    }
}
