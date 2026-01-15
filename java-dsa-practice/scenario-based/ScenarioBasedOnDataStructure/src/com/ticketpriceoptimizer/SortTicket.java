package com.ticketpriceoptimizer;

public class SortTicket {
	Ticket[] tickets;
	
	public SortTicket(Ticket[] tickets) {
		this.tickets  = tickets;
	}
	
	public void sortByPrice() {
		quickSort(0,tickets.length-1,tickets);
	}
	
	//quick sort
	public void quickSort(int low, int high, Ticket[] tickets) {
		if(low < high) {
			int pivot = partition(low,high,tickets);
			
			quickSort(low, pivot-1, tickets);
			quickSort(pivot+1, high, tickets);
		}
	}
	
	//method to find pivot element
	public int partition(int low, int high, Ticket[] tickets) {
		int pivot = tickets[high].getPrice();
		int i = low - 1;
		
		for(int j=low ; j<=high-1 ; j++) {
			if(tickets[j].getPrice() < pivot) {
				i++;
				swap(i,j,tickets);
			}
		}
		swap(i+1,high,tickets);
		return i+1;
	}
	
	public void swap(int i, int j, Ticket[] tickets) {
	    Ticket temp = tickets[i];
	    tickets[i] = tickets[j];
	    tickets[j] = temp;
	}

	//display ticket price with ticket id
	public void display() {
		for(Ticket ticket : tickets) {
			//calling ticket class toString method
			System.out.println(ticket.toString());
		}
	}
}
