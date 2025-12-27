package com.constructor.level1;

public class EBook extends BookLibrary{
	public static void main(String[] args) {
		// creating object and accessing the properties of super class
		EBook book = new EBook();
		book.setAuthor("Authro1");
		System.out.println(book.getAuthor());
		book.ISBN = "Book12";
		book.title = "Title of book";
		book.display();
	}
}
