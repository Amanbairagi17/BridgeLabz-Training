package com.smartparkingmanagementsystem;

public class ParkEaseApplicatioin {
	public static void main(String[] args) {
		ParkingSlot slot1 = new ParkingSlot(1, "Block A", "Car");
        ParkingSlot slot2 = new ParkingSlot(2, "Block B", "Bike");
        ParkingSlot slot3 = new ParkingSlot(2, "Block C", "Bike");

        Vehicle car = new Car("MP08MM9870");
        Vehicle bike = new Bike("MP04MA6057");
        Vehicle truck = new Truck("MP04MS9890");

        if(slot1.parkVehicle(car)) {
            System.out.println("Car parked. Charges: " + car.calculateCharges(6));
        }

        if(slot2.parkVehicle(bike)) {
            System.out.println("Bike parked. Charges: " + bike.calculateCharges(3));
        }

        if(slot2.parkVehicle(truck)) {
            System.out.println("Teuck parked. Charges: " + truck.calculateCharges(3));
        }
        else {
        	System.out.println("Wrong paking slot");
        }
        slot3.showLog();
        slot3.vacateSlot();
        
        slot1.showLog();
        slot2.showLog();

        slot1.vacateSlot();
        slot1.showLog();
	}
}
