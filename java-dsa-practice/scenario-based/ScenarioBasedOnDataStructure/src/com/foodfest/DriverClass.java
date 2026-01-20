package com.foodfest;

public class DriverClass {
	public static void main(String[] args) {
		FoodStall[] stalls = {
				new FoodStall("Burger Hub", 120),
                new FoodStall("Pizza Point", 150),
                new FoodStall("Taco Town", 150),   // equal values
                new FoodStall("Pasta Palace", 180),
                new FoodStall("Sweet Treats", 220),
                new FoodStall("Ice Cream Zone", 300)
		};
		
		Sort s = new Sort();
		s.display(stalls);
		s.mergeSort(stalls);
		System.out.println("After Sorting : ");
		s.display(stalls);
	}
}
