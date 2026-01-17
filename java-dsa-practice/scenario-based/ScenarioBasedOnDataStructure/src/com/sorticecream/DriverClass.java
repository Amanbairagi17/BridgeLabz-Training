package com.sorticecream;

public class DriverClass {
	public static void main(String[] args) {
		IceCream[] arr = {
				new IceCream("Venila", 3),
				new IceCream("Butter scotch", 6),
				new IceCream("Blue berry ", 5),
				new IceCream("American",56)
		};
		
		SortFlavors s = new SortFlavors(arr);
		s.display();
		s.sort();
		System.out.println("After Soritng : ");
		s.display();
	}
}
