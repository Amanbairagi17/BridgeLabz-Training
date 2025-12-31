package com.objectmodelling.level1.librarymanagement;

public class Book {
	//Attribute
	private String title;
    private String author;

    //Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
    //toString method for print book specification
    public String toString() {
    	return "Book : " +this.title + " author : " +this.author;
    }
}
