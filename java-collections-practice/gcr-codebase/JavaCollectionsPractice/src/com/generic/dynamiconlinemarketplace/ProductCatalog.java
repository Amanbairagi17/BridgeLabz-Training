package com.generic.dynamiconlinemarketplace;

import java.util.ArrayList;
import java.util.List;

public class ProductCatalog {
    private List<Product<?>> products = new ArrayList<>();

    public void addProduct(Product<?> product) {
        products.add(product);
    }

    public void showCatalog() {
        for (Product<?> p : products) {
            System.out.println(p);
        }
    }
}
