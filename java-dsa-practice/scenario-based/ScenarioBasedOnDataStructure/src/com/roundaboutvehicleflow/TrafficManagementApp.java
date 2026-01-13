package com.roundaboutvehicleflow;

import java.util.Scanner;

public class TrafficManagementApp {
	public static void main(String[] args) {
		TrafficManager tManager = new TrafficManager();
//		tManager.addVehicle("MP08MP3430");
//		tManager.addVehicle("MP07MX2345");
//		tManager.enterRoundabout();
//		tManager.enterRoundabout();
//		tManager.removeFromRoundabout("MP08MP3430");
//		tManager.addVehicle("MP07MX4345");
//		tManager.addVehicle("MP07MA2545");
//		tManager.printQueue();
//		tManager.printRoundabout();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Traffic Manager ---");
            System.out.println("1. Add vehicle to queue");
            System.out.println("2. Enter roundabout");
            System.out.println("3. Exit roundabout");
            System.out.println("4. Print roundabout");
            System.out.println("5. Print waiting queue");
            System.out.println("0. Exit");
            System.out.print("Choose: ");

            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1 -> {
                    System.out.print("Vehicle number: ");
                    tManager.addVehicle(sc.nextLine());
                }
                case 2 -> tManager.enterRoundabout();
                case 3 -> {
                    System.out.print("Vehicle number to exit: ");
                    tManager.removeFromRoundabout(sc.nextLine());
                }
                case 4 -> tManager.printRoundabout();
                case 5 -> tManager.printQueue();
                case 0 -> {
                    System.out.println("System stopped");
                    return;
                }
                default -> System.out.println("Invalid option");
            }
        }
    }
}
