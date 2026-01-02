package com.encapsulationandpolymorphism.ecommerceplatform;

import java.util.ArrayList;
import java.util.List;

public class DriverClass {
	public static int getTotal(List<Product> list) {
		int total = 0;
		for(Product product : list) {
			total += product.getPrice() + product.calculateTax() - product.calculateDiscount();
		}
		return total;
	}
	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		
		list.add(new Clothing(0, "Shitr", 1000,"puma"));
		list.add(new Groceries(1, "Oil", 1500));
		list.add(new Electronics(2, "Fan", 2000,"TV"));
		
		System.out.println("Total price " + getTotal(list));
	}
}
