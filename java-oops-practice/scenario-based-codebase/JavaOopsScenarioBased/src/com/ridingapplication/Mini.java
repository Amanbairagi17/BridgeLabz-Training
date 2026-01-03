package com.ridingapplication;

public class Mini extends Vehicle{
	public Mini(String vehicleNumber) {
        super(vehicleNumber, 4, 50, 10);
    }

	
    public String getType() {
        return "Mini";
    }
}

