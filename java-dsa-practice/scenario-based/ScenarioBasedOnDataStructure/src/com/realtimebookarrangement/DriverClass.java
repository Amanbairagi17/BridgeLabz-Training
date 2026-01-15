package com.realtimebookarrangement;

import java.util.ArrayList;
import java.util.List;

public class DriverClass {
	public static void main(String[] args) {
		List<Book> books = new ArrayList<Book>();
		books.add(new Book(1, "Let us C"));
		books.add(new Book(9, "Java Programming"));
		books.add(new Book(3, "Rich dad And poor Dad"));
		books.add(new Book(4, "Power"));
		books.add(new Book(6, "General Book"));
		
		SortBook book = new SortBook(books);
		
		System.out.println("Before Sorting : ");
		book.display();
		book.sort();
		System.out.println("After Soritng");
		book.display();
	}
}
