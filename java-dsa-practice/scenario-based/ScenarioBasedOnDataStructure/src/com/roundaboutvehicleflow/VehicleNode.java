package com.roundaboutvehicleflow;

public class VehicleNode {
	public String vehicleNumber;
	VehicleNode nextNode;
	
	public VehicleNode(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
}
