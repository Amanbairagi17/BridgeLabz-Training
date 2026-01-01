package com.inheritance.assitedproblems.vehicletransport;

public class Truck extends Vehicle {
	//Attributes
	private int loadCapacity;

    // constructor
    public Truck(int maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    // display details
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity);
    }

    // getter and setter
	public int getLoadCapacity() {
		return loadCapacity;
	}

	public void setLoadCapacity(int loadCapacity) {
		this.loadCapacity = loadCapacity;
	}
}
