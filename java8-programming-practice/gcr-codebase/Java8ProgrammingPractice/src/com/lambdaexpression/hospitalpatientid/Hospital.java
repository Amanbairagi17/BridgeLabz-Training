package com.lambdaexpression.hospitalpatientid;

import java.util.List;

public class Hospital {
	public static void main(String[] args) {
		List<Patient> patients = List.of(
	            new Patient(101),
	            new Patient(102),
	            new Patient(103),
	            new Patient(104),
	            new Patient(105)
	        );
		patients.forEach(System.out::println);
	}
}
