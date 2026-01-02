package com.linkedlist.moviemanagementsystem;

public class MovieManagementSystemDriver {
	public static void main(String[] args) {
		MovieLinkedList list = new MovieLinkedList();
		list.addAtBeginning("Inception", "Nolan", 2010, 8.8);
        list.addAtEnd("Interstellar", "Nolan", 2014, 8.6);
        list.addAtPosition(2, "Avatar", "Cameron", 2009, 7.8);

        System.out.println("Forward Display:");
        list.displayForward();

        System.out.println("\nReverse Display:");
        list.displayReverse();

        System.out.println("\nSearch by Director (Nolan):");
        list.searchByDirector("Nolan");

        list.updateRating("Avatar", 8.0);
        list.removeByTitle("Inception");

        System.out.println("\nAfter Updates:");
        list.displayForward();
	}
}
