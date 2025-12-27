package com.constructor.level1;

public class BookLibrary {
	//Attribute
	public String ISBN;
	protected String title;
	private String author;
	
	// getter for author name
	public String getAuthor() {
		return author;
	}
	
	// setter for author name
	public void setAuthor(String author) {
		this.author = author;
	}
	
	//display 
	void display() {
		System.out.print(this.ISBN +" : " + this.title + " : " + this.author);
	}
}
