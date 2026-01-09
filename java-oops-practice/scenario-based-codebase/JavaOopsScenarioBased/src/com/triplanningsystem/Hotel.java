package com.triplanningsystem;


public class Hotel implements IBookable{
	private double cost;
	
	public Hotel(double cost) {
		this.cost = cost;
	}

	//setters
	public double getCost() {
		return cost;
	}
	
	@Override
	public void book() {
		System.out.println("Hotel Booked !");
		
	}

	@Override
	public void cancel() {
		System.out.println("Hotel booking cancelled");
	}
	
	
	
}

