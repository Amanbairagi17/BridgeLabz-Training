package com.tailorshop;

import java.util.ArrayList;
import java.util.List;

public class DriverClass {
	public static void main(String[] args) {
		List<Tailor> orders = new ArrayList<>();

		orders.add(new Tailor("Shirt", 2));
		orders.add(new Tailor("Pant", 4));
		orders.add(new Tailor("Coat", 6));
		orders.add(new Tailor("Kurta", 8));
		orders.add(new Tailor("Blazer", 10));
		
		SortByDeadline s = new SortByDeadline(orders);
		System.out.println("Sorted List Intially");
		s.sort()	;
		s.display();
		
		System.out.println("Add One more order");
		s.addOrder(new Tailor("Jacket", 5));
		s.display();
		
		System.out.println("Add One more Order : ");
		s.addOrder(new Tailor("Sherwani", 9));
		
		s.display();

	}
}
