package com.functionalinterface.examples;

import java.util.function.Predicate;

public class TempretureAlertSystem {
	
	public static void main(String[] args) {
		double highestTemp = 42.23;
		//it is a functional interface is used to for check values
		Predicate<Double> isHighTempreture = temp -> temp > highestTemp;
		
		double currTemp = 40.0;
		
		if(isHighTempreture.test(currTemp)) {
			System.out.println("Tempreture is greter then highest tempreture");
		}
		else {
			System.out.println("Tempreture in normal");
		}
	}
}
