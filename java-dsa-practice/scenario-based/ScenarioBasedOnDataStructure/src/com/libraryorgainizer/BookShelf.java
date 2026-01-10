package com.libraryorgainizer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class BookShelf {
	private HashMap<String, LinkedList<Book>> catalog = new HashMap<>();
	private HashSet<String> bookIds = new HashSet<>();
	
	public void add(Book book) {
		//check if book already present or not
		if(bookIds.contains(book.id)) {
			System.out.println("Book Already present!");
			return;
		}
		
		//if book not present then add that and create a linked list
		catalog.putIfAbsent(book.genre, new LinkedList<>());
		//add book in genre
		catalog.get(book.genre).add(book);
		
		//add book id in a set to track duplicate books
		bookIds.add(book.id);
		System.out.println("Book Added : " +book.title);
	}
	
	public void remove(String genre, String id) {
		//get list of book from map
		LinkedList<Book> books = catalog.get(genre);
		//return null if book not exist in a list
        if (books == null) {
        	System.out.println("Genre not have any book");
        	return;
        }
        
        //create iterator that help to iterator
        Iterator<Book> it = books.iterator();
        
        //previous pointer 
        while(it.hasNext()) {
        	//refer to current book
        	Book book = it.next();
        	//checking if book available or not
        	if(book.id.equals(id)){
        		//removing current object
        		it.remove();
        		//remove book id from set
        		bookIds.remove(id);
        		System.out.println("Book remove : " +book.title);
        		return;
        	}
        }
        System.out.println("Book Not Found !!");
	}
	
	//method to display current details
	public void display() {
		if(catalog.size() == 0) {
			System.out.println("Book not availble yet");
			return;
		}
		for (String genre : catalog.keySet()) {
            System.out.println("Genre: " + genre);
            for (Book b : catalog.get(genre)) {
                System.out.println("  " + b.title + " by " + b.author);
            }
        }
	}
	
	
}
