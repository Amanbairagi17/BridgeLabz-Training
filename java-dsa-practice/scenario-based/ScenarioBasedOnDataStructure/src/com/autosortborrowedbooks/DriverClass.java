package com.autosortborrowedbooks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DriverClass {
	public static void main(String[] args) {
		List<Book> list = new ArrayList<>();
		
		list.add(new Book(1,"Let us C"));
		list.add(new Book(3,"Java Programming"));
		list.add(new Book(2,"Think and Grow Rich"));
		list.add(new Book(4,"Atomic habits"));
		list.add(new Book(5,"The power of subconcius mind"));
		
		SortBook s = new SortBook(list);
		s.sort();
		s.display();
		
		System.out.println("Enter 1 to add Book");
		
		Scanner sc = new Scanner(System.in);
		boolean mark = true;
		while(mark) {
			switch (sc.nextInt()) {
			case 1: {
				System.out.println("Enter book Id ");
				int n = sc.nextInt();
     			System.out.println("Enter Book title : ");
     			String str = sc.next();
				s.addBook(new Book(n,str));
				
			}
			
			default:
				mark = false;
			}
		}
		
		s.display();


		
		
	}
}
