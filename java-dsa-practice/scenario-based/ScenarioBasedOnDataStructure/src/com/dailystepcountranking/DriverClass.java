package com.dailystepcountranking;

public class DriverClass {
	public static void main(String[] args) {
		Person[] data = {
				new Person("Aman", 575),
			    new Person("Rohit", 620),
			    new Person("Neha", 540),
			    new Person("Priya", 680),
			    new Person("Karan", 590),
			    new Person("Simran", 610),
			    new Person("Rahul", 565),
			    new Person("Pooja", 700),
			    new Person("Vikas", 585),
			    new Person("Anjali", 650)
		};
		
		SortData s = new SortData(data);
		s.display();
		s.sort();
		System.out.println("After Sroting");
		s.display();
	}
	
	
}
