package com.ridingapplication;

public class Sedan extends Vehicle {
    public Sedan(String vehicleNumber) {
        super(vehicleNumber, 4, 80, 15);
    }

   
    public String getType() {
        return "Sedan";
    }
}

