package com.smartparkingmanagementsystem;

public abstract class Vehicle implements IPayable{
	private String vehicleNumber;
	private String vehicleType;
	
	public Vehicle(String vehicleNumber, String vehicleType) {
		this.vehicleNumber = vehicleNumber;
		this.vehicleType = vehicleType;
	}
	
	public String getType() {
		return this.vehicleType;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
}
