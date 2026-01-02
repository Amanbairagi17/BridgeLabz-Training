package com.vehiclemangementsystem;

public class DriverClass {
	public static void main(String[] args) {

        Customer customer = new Customer(1, "Aman");

        Vehicle bike = new Bike("B101", "Hero");
        Vehicle car = new Car("C201", "Honda", true);
        Vehicle truck = new Truck("T301", "Tata", 5);

        customer.rentVehicle(bike, 3);
        System.out.println("----------------");

        customer.rentVehicle(car, 2);
        System.out.println("----------------");

        customer.rentVehicle(truck, 1);
    }
}
