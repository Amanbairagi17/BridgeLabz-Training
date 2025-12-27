package com.constructor.level1;

public class LibraryBooking {
	// Attributes
    private String title;
    private String author;
    private double price;
    private boolean available;

    // Constructor
    public LibraryBooking(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true; // book is available by default
    }

    // Method to borrow a book
    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println("You have successfully borrowed: " + title);
        } else {
            System.out.println("Sorry, the book is currently unavailable.");
        }
    }

    // Method to return a book (optional but useful)
    public void returnBook() {
        available = true;
        System.out.println("Book returned: " + title);
    }

    // Display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
        System.out.println("Available: " + available);
    }
	
	public static void main(String[] args) {
		// creating object and calling method
		LibraryBooking book = new LibraryBooking("Book1", "Author1", 100);
		book.displayDetails();
		book.borrowBook();
		book.borrowBook();
		book.returnBook();
	}
}
