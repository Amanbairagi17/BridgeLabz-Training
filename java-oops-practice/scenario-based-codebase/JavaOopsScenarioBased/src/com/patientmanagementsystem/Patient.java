package com.patientmanagementsystem;

public abstract class Patient {
	//Attributes
	private int patientId;
	private String name;
	private String medicalHistory;
	
	//constructor
	public Patient(int patientId, String name) {
	    this.patientId = patientId;
	    this.name = name;
	    this.medicalHistory = "Not Disclosed";
	}
	
	// Emergency admission
	public Patient(int patientId, String name, String medicalHistory) {
	    this.patientId = patientId;
	    this.name = name;
	    this.medicalHistory = medicalHistory;
	}
	
	//getters
	public int getPatientId() {
	    return patientId;
	}
	
	public String getName() {
	    return name;
	}
	
	protected String getMedicalHistory() {
	    return medicalHistory;
	}
	
	public abstract void displayInfo();
}


