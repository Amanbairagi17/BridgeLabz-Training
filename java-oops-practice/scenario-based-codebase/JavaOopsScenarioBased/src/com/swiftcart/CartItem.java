package com.swiftcart;

public class CartItem {
    private Product product;
    private int quantity;

    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    double getItemTotal() {
        return product.getPrice() * quantity;   // operator usage
    }

    Product getProduct() {
        return product;
    }
}
