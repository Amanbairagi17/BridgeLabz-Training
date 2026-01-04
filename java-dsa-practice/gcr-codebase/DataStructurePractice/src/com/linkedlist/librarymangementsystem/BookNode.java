package com.linkedlist.librarymangementsystem;

public class BookNode {
	//Field attributes
    int bookId;
    String title;
    String author;
    String genre;
    boolean isAvailable;

    BookNode prev;//pointer to point previous node
    BookNode next;//pointer to point next node

    BookNode(int bookId, String title, String author, String genre, boolean isAvailable) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isAvailable = isAvailable;
        this.prev = null;
        this.next = null;
    }
}

