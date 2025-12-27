package com.constructor.level1;

public class CourseManagement {
	//Attribute
	private String courseName;
	private int duration;
	private int fee;
	private static String instituteName = "Lala Institute";
	
	// constructor
	public CourseManagement(String courseName, int duration, int fee) {
		this.courseName = courseName;
		this.duration = duration;
		this.fee = fee;
	}
	
	// display course details
	public void displayCourseDetails() {
		System.out.println(this.courseName + " " + this.duration + " " + this.fee +" : " +this.instituteName);
	}
	
	// update institute name
	public void updateInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}
	
	public static void main(String[] args) {
		//  create object and call functions
		CourseManagement course = new CourseManagement("b.tech", 4, 100000);
		course.displayCourseDetails();
		course.updateInstituteName("New lala institute ");
		course.displayCourseDetails();
	}
}
