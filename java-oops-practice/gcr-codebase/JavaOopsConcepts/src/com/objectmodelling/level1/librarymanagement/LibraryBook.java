package com.objectmodelling.level1.librarymanagement;

import java.util.ArrayList;
import java.util.List;

public class LibraryBook {
	//Attribute
	public List<Book> books;
	
	//argument for book object
	public LibraryBook(Book... curr) {
		books = new ArrayList<Book>();
		for(Book book : curr) books.add(book);
	}
	
	//toString method for print book present in library
	public String toString(){
		StringBuilder sb = new StringBuilder();
		for(var s : books) {
			sb.append(s.toString()+" ");
		}
		return sb.toString();
	}
}
