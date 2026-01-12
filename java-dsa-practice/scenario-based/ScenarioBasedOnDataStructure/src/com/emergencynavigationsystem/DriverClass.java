package com.emergencynavigationsystem;

public class DriverClass {
	 public static void main(String[] args) {

	        RoutingSystem system = new RoutingSystem();

	        system.addUnit("Emergency", true);
	        system.addUnit("Radiology", false);
	        system.addUnit("Surgery", false);
	        system.addUnit("ICU", true);

	        System.out.println("Routing Patient:");
	        system.routePatient();

	        system.removeUnit("Emergency");

	        System.out.println("Routing Patient:");
	        system.routePatient();
	    }
}
