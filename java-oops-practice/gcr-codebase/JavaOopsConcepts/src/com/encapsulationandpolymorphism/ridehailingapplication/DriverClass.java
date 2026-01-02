package com.encapsulationandpolymorphism.ridehailingapplication;

import java.util.ArrayList;
import java.util.List;

public class DriverClass {
	public static void calculateFareForAll(List<Vehicle> list, double distance) {
        for (Vehicle vehicle : list) {
            vehicle.getVehicleDetails();
            System.out.println("Fare : " + vehicle.calculateFare(distance));
        }
    }

    public static void main(String[] args) {
        List<Vehicle> list = new ArrayList<>();

        list.add(new Car(1, "Aman", 15));
        list.add(new Bike(2, "Tarun", 8));
        list.add(new Auto(3, "Auto driver", 10));

        calculateFareForAll(list, 12.5);
    }
}
