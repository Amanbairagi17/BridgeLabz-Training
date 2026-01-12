package com.customerqueuemanager;

import java.util.Scanner;

public class CallCenterApp {
	public static void main(String[] args) {
		CallCenterManager manager = new CallCenterManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Call Center Menu ---");
            System.out.println("1. Incoming Call");
            System.out.println("2. Handle Next Call");
            System.out.println("3. Show Call Statistics");
            System.out.println("0. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Customer ID: ");
                    String id = sc.nextLine();

                    System.out.print("Enter Customer Name: ");
                    String name = sc.nextLine();

                    System.out.print("Is VIP? (true/false): ");
                    boolean isVIP = sc.nextBoolean();
                    sc.nextLine();

                    manager.receiveCall(new Customer(id, name, isVIP));
                }

                case 2 -> manager.handleNextCall();

                case 3 -> manager.showCallStats();

                case 0 -> {
                    System.out.println("Exiting Call Center System...");
                    return;
                }

                default -> System.out.println("Invalid choice");
            }
        }
	}
}
