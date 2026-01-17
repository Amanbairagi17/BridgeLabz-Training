package com.vehiclemanagementsystem;

public class Vehicle {
	private String vehicleId;
	private int mileage;
	
	public Vehicle(String vehicleId, int mileage) {
		super();
		this.vehicleId = vehicleId;
		this.mileage = mileage;
	}

	public String getVehicleId() {
		return vehicleId;
	}

	public int getMileage() {
		return mileage;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", mileage=" + mileage + "]";
	}
	
	
}
