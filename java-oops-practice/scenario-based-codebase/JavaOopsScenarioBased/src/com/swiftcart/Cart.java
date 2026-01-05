package com.swiftcart;

import java.util.ArrayList;
import java.util.List;

public class Cart implements ICheckout {

    private List<CartItem> items;
    private double totalPrice;

    // Empty cart
    public Cart() {
        items = new ArrayList<>();
    }

    // Cart with pre-selected items
    public Cart(List<CartItem> items) {
        this.items = items;
        calculateTotal();
    }

    public void addItem(Product product, int quantity) {
        items.add(new CartItem(product, quantity));
        calculateTotal();
    }

    // Only Cart can update prices Overridden method
    private void calculateTotal() {
        totalPrice = 0;
        for (CartItem item : items) {
            totalPrice += item.getItemTotal();
        }
    }

    @Override
    public void applyDiscount() {
        double discount = 0;
        for (CartItem item : items) {
            discount += item.getProduct().getDiscount(item.getItemTotal());
        }
        totalPrice = totalPrice - discount;   // operator usage
    }

    @Override
    public void generateBill() {
        applyDiscount();
        System.out.println("Total Bill Amount: ₹" + totalPrice);
    }
}

