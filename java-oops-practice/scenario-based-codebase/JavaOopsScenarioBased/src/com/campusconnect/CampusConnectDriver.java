package com.campusconnect;

public class CampusConnectDriver {
	public static void main(String[] args) {

        Student s1 = new Student("Aman", "aman@gmail.com", "S101");
        s1.addGrade(8);
        s1.addGrade(9);

        Faculty f1 = new Faculty("Dr. Sharma", "sharma@college.edu", "F201", "Computer Science");

        Course course = new Course("Data Structures", f1);

        course.enrollCourse(s1);

        // Polymorphism
        Person p1 = s1;
        Person p2 = f1;

        p1.printDetails();
        p2.printDetails();
    }
}
