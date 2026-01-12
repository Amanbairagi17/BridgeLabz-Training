package com.compartmentnavigationsystem;

import java.util.Scanner;

public class DriverClass {
	public static void main(String[] args) {
        TrainCompanion train = new TrainCompanion();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Train Companion Menu ---");
            System.out.println("1. Add Compartment");
            System.out.println("2. Move Next");
            System.out.println("3. Move Previous");
            System.out.println("4. Show Current Compartment");
            System.out.println("5. Show Adjacent Compartments");
            System.out.println("6. Remove Current Compartment");
            System.out.println("7. Search Service");
            System.out.println("0. Exit");
            System.out.print("Choose: ");

            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1 -> {
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Pantry (true/false): ");
                    boolean pantry = sc.nextBoolean();
                    System.out.print("WiFi (true/false): ");
                    boolean wifi = sc.nextBoolean();
                    train.addCompartment(name, pantry, wifi);
                }
                case 2 -> train.moveNext();
                case 3 -> train.movePrev();
                case 4 -> train.showCurrent();
                case 5 -> train.showAdjacent();
                case 6 -> train.removeCurrent();
                case 7 -> {
                    System.out.print("Service (pantry/wifi): ");
                    String service = sc.nextLine();
                    train.searchService(service);
                }
                case 0 -> {
                    System.out.println("Exiting Train Companion...");
                    return;
                }
                default -> System.out.println("Invalid option");
            }
        }
    }
}
