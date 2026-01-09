package com.triplanningsystem;


public class Activity implements IBookable{
	private double cost;
	
	public Activity(double cost) {
		this.cost = cost;
	}

	//setters
	public double getCost() {
		return cost;
	}
	
	@Override
	public void book() {
		System.out.println("Activity Booked !");
		
	}

	@Override
	public void cancel() {
		System.out.println("Activity  booking cancelled");
	}
	
	
	
}
