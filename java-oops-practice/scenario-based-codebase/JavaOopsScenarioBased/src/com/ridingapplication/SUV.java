package com.ridingapplication;

public class SUV extends Vehicle {
    public SUV(String vehicleNumber) {
        super(vehicleNumber, 6, 120, 20);
    }


    public String getType() {
        return "SUV";
    }
}
