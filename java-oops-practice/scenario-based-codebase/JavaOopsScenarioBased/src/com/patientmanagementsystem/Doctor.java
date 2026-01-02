package com.patientmanagementsystem;

public class Doctor {
	//attributes
    private int doctorId;
    private String name;
    private String specialization;

    //constructor
    public Doctor(int doctorId, String name, String specialization) {
        this.doctorId = doctorId;
        this.name = name;
        this.specialization = specialization;
    }

    public void displayInfo() {
        System.out.println("Doctor: " + name);
        System.out.println("Specialization: " + specialization);
    }
}

