package com.constructor.level1;

public class Vehicle {
	//Attributes
	private String  ownerName;
	private String vehicleType;
	private int registrationFee = 10000;
	
	// constructor
	public Vehicle(String ownerName, String vehicleType) {
		this.ownerName = ownerName;
		this.vehicleType = vehicleType;
	}
	
	// display details
	public void displayVehicleDetails() {
		System.out.println(ownerName + " : " + vehicleType);
	}
	
	// update the registration fee
	public void updateRegistrationFee(int registrationFee) {
		this.registrationFee = registrationFee;
	}
	
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle("Owner 1", "Type 1");
		vehicle.displayVehicleDetails();
		vehicle.updateRegistrationFee(15000);
		Vehicle vehicle1 = new Vehicle("Me" , "Nothing");
		vehicle1.displayVehicleDetails();
	}
}
