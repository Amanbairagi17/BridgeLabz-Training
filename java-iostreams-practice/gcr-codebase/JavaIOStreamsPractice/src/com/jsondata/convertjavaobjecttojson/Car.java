package com.jsondata.convertjavaobjecttojson;

public class Car {
    private String brand;
    private int year;
    private double price;

    public Car(String brand, int year, double price) {
        this.brand = brand;
        this.year = year;
        this.price = price;
    }

    // getters
    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", year=" + year + ", price=" + price + "]";
	}
    
}
