package com.realtimebookarrangement;

import java.util.ArrayList;
import java.util.List;

public class SortBook {
	private List<Book> books = new ArrayList<Book>();
	
	public SortBook(List<Book> books) {
		this.books = books;
	}
	
	void sort() {
		for(int i=1 ; i<books.size() ; i++) {
			Book book = books.get(i);
			int j = i-1;
			
			while(j >= 0 && books.get(j).getBookTitle().compareTo(book.getBookTitle()) > 1) {
				books.set(j+1,books.get(j));
				j--;
			}
			books.set(j+1, book);
		}
	}
	
	void display() {
		for(Book b : books) {
			System.out.println("Book Id : " + b.getId() + " Book Title : " +b.getBookTitle());
		}
	}
}
