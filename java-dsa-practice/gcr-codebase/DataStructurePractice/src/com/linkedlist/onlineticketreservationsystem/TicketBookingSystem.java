package com.linkedlist.onlineticketreservationsystem;

public class TicketBookingSystem {
	public static void main(String[] args) {

        TicketReservationSystem system = new TicketReservationSystem();

        system.addTicket(1, "Aman", "Inception", "A1", "10:30 AM");
        system.addTicket(2, "Rohan", "Inception", "A2", "10:30 AM");
        system.addTicket(3, "Neha", "Interstellar", "B1", "01:00 PM");
        system.addTicket(4, "Priya", "Avatar", "C3", "06:45 PM");

        System.out.println("All Tickets:");
        system.displayTickets();

        System.out.println("\nSearch by Customer (Aman):");
        system.searchByCustomer("Aman");

        System.out.println("\nSearch by Movie (Inception):");
        system.searchByMovie("Inception");

        system.removeTicket(2);

        System.out.println("\nAfter Removing Ticket ID 2:");
        system.displayTickets();

        System.out.println("\nTotal Booked Tickets: " + system.totalTickets());
    }
}
