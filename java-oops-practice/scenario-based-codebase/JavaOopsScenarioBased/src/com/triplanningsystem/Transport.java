package com.triplanningsystem;

public class Transport implements IBookable{
	private double cost;
	
	public Transport(double cost) {
		this.cost = cost;
	}

	//setters
	public double getCost() {
		return cost;
	}
	
	@Override
	public void book() {
		System.out.println("Transport Booked !");
		
	}

	@Override
	public void cancel() {
		System.out.println("Transport  booking cancelled");
	}
	
	
	
}
