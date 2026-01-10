package com.tabhistorymanager;

import java.util.Scanner;

public class DriverClass {
	public static void main(String[] args) {

		BrowserBuddy browser = new BrowserBuddy();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- BrowserBuddy Menu ---");
            System.out.println("1. Visit new page");
            System.out.println("2. Back");
            System.out.println("3. Forward");
            System.out.println("4. Show current page");
            System.out.println("5. Close tab");
            System.out.println("6. Reopen closed tab");
            System.out.println("0. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter URL: ");
                    String url = sc.nextLine();
                    browser.visit(url);
                }
                case 2 -> browser.back();
                case 3 -> browser.forward();
                case 4 -> browser.showCurrentPage();
                case 5 -> browser.closeTab();
                case 6 -> browser.reopenTab();
                case 0 -> {
                    System.out.println("Exiting BrowserBuddy...");
                    return;
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }
}
