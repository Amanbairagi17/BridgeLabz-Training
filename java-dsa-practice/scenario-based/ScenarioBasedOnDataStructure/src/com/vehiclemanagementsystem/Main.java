package com.vehiclemanagementsystem;

public class Main {
	public static void main(String[] args) {
		Vehicle[] vehicles = {
				new Vehicle("SSD01", 120),
				new Vehicle("SSD31", 20),
				new Vehicle("SSD03", 60),
				new Vehicle("SSD33", 140),
				new Vehicle("SSD54", 100),
		};
		
		SortData s = new SortData(vehicles);
		s.display();
		s.sort();
		System.out.println("After sorting data ");
		s.display();
	}
}
