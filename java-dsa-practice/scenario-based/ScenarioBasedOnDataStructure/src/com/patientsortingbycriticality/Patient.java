package com.patientsortingbycriticality;

public class Patient {
	private int patientId;
	private String name;
	public int criticality;
	
	
	public Patient(int patientId, String name, int criticality) {
		this.patientId = patientId;
		this.name = name;
		this.criticality = criticality;
	}


	public int getPatientId() {
		return patientId;
	}


	public String getName() {
		return name;
	}
	
	
}