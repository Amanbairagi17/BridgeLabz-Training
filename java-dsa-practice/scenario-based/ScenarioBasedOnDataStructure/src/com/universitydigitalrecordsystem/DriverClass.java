package com.universitydigitalrecordsystem;

public class DriverClass {
	public static void main(String[] args) {

        Tree tree = new Tree();

        //  insertion
        tree.insert(new Student(105, "Aman", "CSE"));
        tree.insert(new Student(102, "Rohit", "ECE"));
        tree.insert(new Student(110, "Neha", "IT"));
        tree.insert(new Student(101, "Kunal", "ME"));
        tree.insert(new Student(108, "Pooja", "CSE"));

        // sorted display
        tree.displaySorted();

        // search
        System.out.println("\nSearching roll 110:");
        Student s = tree.search(110);
        if (s != null)
            System.out.println(s.rollNo + " " + s.name + " " + s.department);
        else
            System.out.println("Student not found");

        //deletion
        System.out.println("\nDeleting roll 102");
        tree.delete(102);

        //sorted after deletion
        tree.displaySorted();
    }
}
