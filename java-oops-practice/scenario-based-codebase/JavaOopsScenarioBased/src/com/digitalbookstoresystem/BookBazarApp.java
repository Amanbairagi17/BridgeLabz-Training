package com.digitalbookstoresystem;
import java.util.List;

public class BookBazarApp {
    public static void main(String[] args) {

    	// Static books
        Book book1 = new EBook("Java Basics", "James", 500, 10);
        Book book2 = new PrintedBook("DSA", "Robert", 700, 5);
        Book book3 = new PrintedBook("Spring Boot", "Pivotal", 900, 3);

        // List of books (ONE order → MANY books)
        List<Book> books = List.of(book1, book2, book3);

        // Static order
        Order order = new Order("Aman", books, 1);

        // Place order
        order.placeOrder();
    }
}
