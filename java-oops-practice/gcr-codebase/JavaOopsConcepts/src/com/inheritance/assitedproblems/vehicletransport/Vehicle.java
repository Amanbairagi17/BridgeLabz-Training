package com.inheritance.assitedproblems.vehicletransport;

public class Vehicle {
	//Attributes
	private int maxSpeed;
    private String fuelType;

    // Constructor
    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }
    
    // getter and setter
    public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public void displayInfo() {
		System.out.println(maxSpeed + " km/h" + "Fuel Type: " + fuelType);
		
	}
}
