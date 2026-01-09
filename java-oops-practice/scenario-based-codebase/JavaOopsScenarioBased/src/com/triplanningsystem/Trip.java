package com.triplanningsystem;

public abstract class Trip implements IBookable{
	private String destination;
	private double budget;
	private int duration;
	
	//association
	protected Transport transport;
	protected Activity activity;
	protected Hotel hotel;
	
	//constructor
	public Trip(String destination, double budget, int duration, 
			Transport transport, Activity activity, Hotel hotel) {
		this.destination = destination;
		this.budget = budget;
		this.duration = duration;
		this.transport = transport;
		this.activity = activity;
		this.hotel = hotel;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	
}