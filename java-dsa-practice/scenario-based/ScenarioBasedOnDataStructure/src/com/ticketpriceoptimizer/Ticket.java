package com.ticketpriceoptimizer;

public class Ticket {
	private String ticketId;
	private int price;
	
	public Ticket(String ticketId, int price) {
		super();
		this.ticketId = ticketId;
		this.price = price;
	}

	public String getTicketId() {
		return ticketId;
	}

	public int getPrice() {
		return price;
	}
	
	public String toString() {
		return " Ticket Id : " +this.ticketId + " Ticket Price : " +this.price;
	}
}

