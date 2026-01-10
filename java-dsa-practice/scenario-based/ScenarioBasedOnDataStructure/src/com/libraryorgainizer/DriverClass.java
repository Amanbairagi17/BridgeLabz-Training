package com.libraryorgainizer;

import java.util.Scanner;

public class DriverClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        BookShelf shelf = new BookShelf();

        while (true) {

            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Display Books");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter Book ID: ");
                    String id = sc.nextLine();

                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();

                    System.out.print("Enter Genre: ");
                    String genre = sc.nextLine();

                    shelf.add(new Book(id, title, author, genre));
                    break;

                case 2:
                    System.out.print("Enter Book ID to remove: ");
                    String removeId = sc.nextLine();

                    System.out.print("Enter Genre: ");
                    String removeGenre = sc.nextLine();

                    shelf.remove(removeId, removeGenre);
                    break;

                case 3:
                    shelf.display();
                    break;

                case 4:
                    System.out.println("Exiting Library System.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
	}
}
