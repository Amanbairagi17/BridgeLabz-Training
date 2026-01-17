package com.sortartistbytime;

public class Main {
	public static void main(String[] args) {
		Artist[] artists = {
		new Artist("Ravi", "09:30:15"),
		new Artist("Aman", "09:31:10"),
		new Artist("Neha", "09:29:40")
		};
		
		SortTime sortTime = new SortTime(artists);
		sortTime.display();
		sortTime.sort();
		System.out.println("After Soritng : ");
		sortTime.display();
	}
	
}

