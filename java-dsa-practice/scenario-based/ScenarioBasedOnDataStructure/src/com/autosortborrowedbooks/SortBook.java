package com.autosortborrowedbooks;

import java.util.ArrayList;
import java.util.List;

public class SortBook {
	List<Book> books = new ArrayList<>();
	
	
	
	public SortBook(List<Book> books) {
		this.books = books;
	}

	void addBook(Book book) {
		books.add(book);
		
		int j = books.size() - 1;
		
		while(j >= 0 && books.get(j).getTitle().compareTo(book.getTitle()) > 1) {
			books.set(j+1,books.get(j));
			j--;
		}
		
		
	}
	
	void sort() {
		for(int i=1 ; i<books.size() ; i++) {
			Book book = books.get(i);
			int j = i-1;
			
			while(j >= 0 && books.get(j).getTitle().compareTo(book.getTitle()) > 1) {
				books.set(j+1,books.get(j));
				j--;
			}
			books.set(j+1, book);
		}
	}
	
	void display() {
		for(Book book : books) {
			System.out.println(book);
		}
	}
	
}