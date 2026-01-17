package com.autosortborrowedbooks;

public class Book {
	private int bookId;
	private String title;
	
	//constructor
	public Book(int bookId, String title) {
		super();
		this.bookId = bookId;
		this.title = title;
	}

	//getters
	public int getBookId() {
		return bookId;
	}

	public String getTitle() {
		return title;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + "]";
	}
	
	
}
