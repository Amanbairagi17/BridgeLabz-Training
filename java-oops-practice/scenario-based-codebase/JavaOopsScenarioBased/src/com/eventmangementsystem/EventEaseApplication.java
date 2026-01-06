package com.eventmangementsystem;

import java.util.Scanner;
import java.util.UUID;

public class EventEaseApplication {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Organizer input
        System.out.print("Enter Organizer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Organizer Email: ");
        String email = sc.nextLine();

        User organizer = new User(name, email);

        // Event choice
        System.out.println("\nChoose Event Type:");
        System.out.println("1. Birthday");
        System.out.println("2. Conference");
        int choice = sc.nextInt();
        sc.nextLine();

        // Event details
        System.out.print("Event Name: ");
        String eventName = sc.nextLine();

        System.out.print("Location: ");
        String location = sc.nextLine();

        System.out.print("Date (DD-MM-YYYY): ");
        String date = sc.nextLine();

        System.out.print("Number of Attendees: ");
        int attendees = sc.nextInt();

        System.out.print("Venue Cost: ");
        double venueCost = sc.nextDouble();

        System.out.print("Service Cost (catering/decor): ");
        double serviceCost = sc.nextDouble();

        System.out.print("Discount: ");
        double discount = sc.nextDouble();

        String eventId = UUID.randomUUID().toString();

        Event event;

        if (choice == 1) {
            event = new BirthdayEvent(eventId, eventName, location,
                    date, attendees, venueCost, serviceCost, discount, organizer);
        } else {
            event = new ConferenceEvent(eventId, eventName, location,
                    date, attendees, venueCost, serviceCost, discount, organizer);
        }

        event.schedule();

        // Reschedule demo
        System.out.print("\nEnter new date to reschedule (or press Enter to skip): ");
        sc.nextLine();
        String newDate = sc.nextLine();
        if (!newDate.isEmpty()) {
            event.reschedule(newDate);
        }

        sc.close();
    }
}
