package com.linkedlist.librarymangementsystem;

public class LibraryManagement {
    public static void main(String[] args) {

        LibraryList library = new LibraryList();

        library.addAtBeginning(101, "Java Basics", "James Gosling", "Programming", true);
        library.addAtEnd(102, "Clean Code", "Robert Martin", "Software", true);
        library.addAtEnd(103, "DSA", "Narasimha Karumanchi", "Education", false);
        library.addAtPosition(2, 104, "Effective Java", "Joshua Bloch", "Programming", true);
        library.addAtEnd(105,"The 7 Habits of Highly Effective People","Stephen Covey","Self-Help",true);
        library.addAtEnd(106,"You Can Heal Your Life","Louise Hay","Self-Help",true);
        library.addAtEnd(107,"The Subtle Art of Not Giving a F*ck","Mark Manson","Self-Help",false);

        System.out.println("Library (Forward):");
        library.displayForward();

        System.out.println("\nLibrary (Reverse):");
        library.displayReverse();

        System.out.println("\nSearch by Author: Robert Martin");
        library.searchByAuthor("Robert Martin");

        library.updateAvailability(103, true);
        System.out.println("\nTotal Books in Library: " + library.countBooks());

        library.removeById(101);

        System.out.println("\nAfter Updates:");
        library.displayForward();

        System.out.println("\nTotal Books in Library: " + library.countBooks());
    }
}

