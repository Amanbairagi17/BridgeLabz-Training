package com.parceltracker;

import java.util.Scanner;

public class DriverClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        ParcelTracker tracker = new ParcelTracker();

        while (true) {
            System.out.println("\n--- Parcel Tracker ---");
            System.out.println("1. Track Parcel");
            System.out.println("2. Add Checkpoint");
            System.out.println("3. Mark Parcel Lost");
            System.out.println("0. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> tracker.trackParcel();

                case 2 -> {
                    System.out.print("Add after stage: ");
                    String after = sc.nextLine();

                    System.out.print("New checkpoint name: ");
                    String stage = sc.nextLine();

                    tracker.addCheckpoint(after, stage);
                }

                case 3 -> tracker.markParcelLost();

                case 0 -> {
                    System.out.println("Exiting Parcel Tracker...");
                    return;
                }

                default -> System.out.println("Invalid choice");
            }
        }
	}
}
