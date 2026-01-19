package com.productsortingbydiscount;

import java.util.ArrayList;
import java.util.List;

public class DriverClass {
	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();

	    products.add(new Product("iPhone 15", 25));
	    products.add(new Product("Samsung TV", 40));
	    products.add(new Product("Nike Shoes", 70));
	    products.add(new Product("HP Laptop", 15));
	    products.add(new Product("Boat Headphones", 55));
	    products.add(new Product("Smart Watch", 60));
	    products.add(new Product("Bluetooth Speaker", 35));
	    products.add(new Product("Gaming Mouse", 45));
	    products.add(new Product("Keyboard", 20));
	    products.add(new Product("Power Bank", 50));
	    
	    SortPrice p = new SortPrice(products);
	    p.display();
	    p.sortByDiscount();
	    System.out.println("After Soritng : ");
	    p.display();
	}
}
