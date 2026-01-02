package com.encapsulationandpolymorphism.librarymanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class DriverClass {
	public static void main(String[] args) {
    	// storing in a list of LibraryItem
        List<LibraryItem> list = new ArrayList<>();
        list.add(new Book(1, "Java Basics", "James"));
        list.add(new Magazine(2, "Tech Monthly", "Editor"));
        list.add(new DVD(3, "Learning Java", "Studio"));

        for (LibraryItem item : list) {
            item.getItemDetails();
            System.out.println("duration : " + item.getLoanDuration() + ", available : " + item.checkAvailability());
        }
	}
}
