package com.lambdaexpression.ecommerce;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Shop {
	public static void main(String[] args) {
		List<Product> products = Arrays.asList(
	            new Product("Laptop", 4.5, 65000, 10),
	            new Product("Smartphone", 4.3, 30000, 15),
	            new Product("Headphones", 4.1, 2000, 20),
	            new Product("Monitor", 4.6, 18000, 14)
	        );
		Collections.sort(products, (a, b) -> Double.compare(b.rating, a.rating));
		System.out.println(products);
		Collections.sort(products, (a, b) -> Double.compare(a.price, b.price));
		System.out.println(products);
		Collections.sort(products, (a, b) -> Double.compare(b.discount, a.discount));
		System.out.println(products);
	}
}
