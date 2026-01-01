package com.inheritance.multilevelinheritance.courseheirarchy;

public class PaidOnlineCourse extends OnlineCourse {
	//attribute
	public double fee;
    public double discount;

    // constructor
    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    // display details
    public void displayDetails() {
        super.displayDetails();
        System.out.println(fee + " " + discount);
    }
}
