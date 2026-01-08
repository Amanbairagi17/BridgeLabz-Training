package com.smartparkingmanagementsystem;

public class Truck extends Vehicle {

	public Truck(String vehicleNumber) {
		super(vehicleNumber, "Truck");
		
	}
	
	@Override
	public double calculateCharges(int hours) {
		int baseRate = 80;
		int penality = hours > 5 ? 200 : 0;
		return (baseRate * hours) + penality;
	}

	
}