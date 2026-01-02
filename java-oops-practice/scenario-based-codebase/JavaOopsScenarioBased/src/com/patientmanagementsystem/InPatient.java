package com.patientmanagementsystem;

public class InPatient extends Patient {
	//attributes
    private int daysAdmitted;
    private double dailyCharge;

    //constructor
    public InPatient(int id, String name, int daysAdmitted, double dailyCharge) {
        super(id, name);
        this.daysAdmitted = daysAdmitted;
        this.dailyCharge = dailyCharge;
    }

    
    public double calculateRoomCharges() {
        return daysAdmitted * dailyCharge;
    }

    @Override
    public void displayInfo() {
        System.out.println("In-Patient: " + getName());
        System.out.println("Days Admitted: " + daysAdmitted);
    }
}

