package com.ticketpriceoptimizer;

public class EventTicket {
	public static void main(String[] args) {
		Ticket[] lisTickets = {
				new Ticket("123", 1000),
				new Ticket("143", 5600),
				new Ticket("126", 9900),
				new Ticket("124", 10000),
				new Ticket("163", 100),
				new Ticket("173", 160),
		};
		
		SortTicket ticket = new SortTicket(lisTickets);
		
		System.out.println("Before sorting");
		ticket.display();
		ticket.sortByPrice();
		System.out.println("After Soritng ");
		ticket.display();
		
		
	}
}
