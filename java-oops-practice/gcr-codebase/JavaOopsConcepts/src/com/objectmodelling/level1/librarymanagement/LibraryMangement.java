package com.objectmodelling.level1.librarymanagement;

public class LibraryMangement {
	public static void main(String[] args) {
		Book b1 = new Book("Let us C", "Author 1");
		Book b2 = new Book("Advance Java", "Author 2");
		LibraryBook library = new LibraryBook(b1, b2);
		
		//printing all books 
		System.out.println(library);
	}
}
