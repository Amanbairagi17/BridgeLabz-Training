package com.objectmodelling.level1.ecommerceplatform;

import java.util.ArrayList;

public class Order {
	//Attributes
	private String id;
    private ArrayList<Product> products;

    // constructor
    public Order(String orderNumber) {
        this.id = id;
        this.products = new ArrayList<>();
    }

    // add producut
    public void addProduct(Product product) {
        products.add(product);
    }

    // calculate total price
    public void showProducts() {
        for (Product p : products) System.out.println(p.getProductName() + " ");
    }
}
