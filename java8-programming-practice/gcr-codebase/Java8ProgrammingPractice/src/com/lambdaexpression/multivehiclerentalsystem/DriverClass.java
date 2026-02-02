package com.lambdaexpression.multivehiclerentalsystem;

public class DriverClass {
	public static void main(String[] args) {
		Vehicle v1 = new Car();
		Vehicle v2 = new Bike();
		Vehicle v3 = new Bus();

		v1.rent();
		v2.rent();
		v3.rent();

	}
}
