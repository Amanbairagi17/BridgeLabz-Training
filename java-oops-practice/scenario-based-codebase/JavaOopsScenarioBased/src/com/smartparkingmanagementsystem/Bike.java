package com.smartparkingmanagementsystem;

public class Bike extends Vehicle {

	public Bike(String vehicleNumber) {
		super(vehicleNumber, "Bike");
		
	}
	
	@Override
	public double calculateCharges(int hours) {
		int baseRate = 20;
		int penality = hours > 5 ? 50 : 0;
		return (baseRate * hours) + penality;
	}

	
}
