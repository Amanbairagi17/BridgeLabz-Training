package com.smartparkingmanagementsystem;

public class Car extends Vehicle {

	public Car(String vehicleNumber) {
		super(vehicleNumber, "Car");
		
	}
	
	@Override
	public double calculateCharges(int hours) {
		int baseRate = 50;
		int penality = hours > 5 ? 100 : 0;
		return (baseRate * hours) + penality;
	}

	
}
