package com.patientsortingbycriticality;

import java.util.ArrayList;
import java.util.List;

public class DriverClass {
	public static void main(String[] args) {
		Patient patient1 = new Patient(12, "Ram", 1);
		Patient patient2 = new Patient(13, "Ravi", 6);
		Patient patient3 = new Patient(15, "Raghu", 5);
		Patient patient4 = new Patient(16, "Rahim", 2);
		Patient patient5 = new Patient(18, "Rajaram", 4);
		
		List<Patient> listPatients = new ArrayList<Patient>();
		listPatients.add(patient5);
		listPatients.add(patient4);
		listPatients.add(patient3);
		listPatients.add(patient2);
		listPatients.add(patient1);
		
		SortPatinet p = new SortPatinet(listPatients);
		System.out.println("Before Sorting");
		p.display();
		p.sort();
		System.out.println("After Sorting ");
		p.display();
		
		
		
	}
}
