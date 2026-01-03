package com.ridingapplication;

public class Driver {
	//attributes
    private String name;
    private String licenseNumber;
    private double rating;

    //constructor
    public Driver(String name, String licenseNumber, double rating) {
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.rating = rating;
    }

    //getters 
    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }
}

