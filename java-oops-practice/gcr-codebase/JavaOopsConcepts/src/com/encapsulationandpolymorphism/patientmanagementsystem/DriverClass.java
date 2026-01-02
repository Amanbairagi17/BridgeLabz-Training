package com.encapsulationandpolymorphism.patientmanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class DriverClass {
	public static void main(String[] args) {
    	// creating list of patient
        List<Patient> list = new ArrayList<>();
        list.add(new InPatient(1, "Aman", 30, 5));
        list.add(new OutPatient(2, "Tarun", 22));

        for (Patient p : list) {
            p.getPatientDetails();
            p.viewRecords();
            System.out.println("Bill : " + p.calculateBill());
        }
    }
}
