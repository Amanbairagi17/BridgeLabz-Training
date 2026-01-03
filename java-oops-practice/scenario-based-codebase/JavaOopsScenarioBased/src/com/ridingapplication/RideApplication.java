package com.ridingapplication;

import java.util.Scanner;

public class RideApplication {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Driver input
        System.out.print("Enter Driver Name: ");
        String driverName = sc.nextLine();

        System.out.print("Enter License Number: ");
        String license = sc.nextLine();

        System.out.print("Enter Driver Rating: ");
        double rating = sc.nextDouble();
        sc.nextLine(); // consume newline

        Driver driver = new Driver(driverName, license, rating);

        // Vehicle input
        System.out.print("Enter Vehicle Type (Mini / Sedan / SUV): ");
        String vehicleType = sc.nextLine();

        System.out.print("Enter Vehicle Number: ");
        String vehicleNumber = sc.nextLine();

        Vehicle vehicle = null;

        switch (vehicleType.toLowerCase()) {
            case "mini" -> vehicle = new Mini(vehicleNumber);
            case "sedan" -> vehicle = new Sedan(vehicleNumber);
            case "suv" -> vehicle = new SUV(vehicleNumber);
            default -> {
                System.out.println("Invalid vehicle type!");
                System.exit(0);
            }
        }

        // Ride input
        System.out.print("Enter Distance (in km): ");
        double distance = sc.nextDouble();

        IRideService rideService = new RideService();
        rideService.bookRide(driver, vehicle, distance);
        rideService.endRide();

        sc.close();
    }
}
