package com.patientsortingbycriticality;

import java.util.ArrayList;
import java.util.List;

public class SortPatinet {
	private List<Patient> list = new ArrayList<Patient>();
	
	public SortPatinet(List<Patient> list) {
		this.list = list;
	}
	
//	void addPatient(Patient p) {
//		list.add(p);
//	}
	
	void sort() {
		
		 
		 for(int i=0 ; i<list.size() ; i++) {
			 boolean flag = false;
			 for(int j=0 ; j<list.size()-i-1; j++) {
				 if(list.get(j).criticality > list.get(j+1).criticality) {
					 int temp = list.get(j).criticality;
					 list.get(j).criticality = list.get(j+1).criticality;
					 list.get(j+1).criticality = temp;
					 flag = true;
				 }
			 }
			 if(!flag) {
				 System.out.println("Patient already in correct order : ");
				 break;
			 }
		 }
	}
	void display() {
		for(Patient patient : list) {
			System.out.println("Patient Id : " + patient.getPatientId()+ " Patient Name : " +patient.getName()+ " Critacality " +patient.criticality);
		}
	}
}
