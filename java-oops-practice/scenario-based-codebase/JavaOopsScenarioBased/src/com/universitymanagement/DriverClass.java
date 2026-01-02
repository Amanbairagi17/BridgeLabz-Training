package com.universitymanagement;

public class DriverClass {
	public static void main(String[] args) {

        Student s1 = new Undergraduate(101, "Aman");
        Student s2 = new Postgraduate(201, "Rohit", 3.5);

        Course java = new Course("CS101", "Java Programming", 4);

        Faculty faculty = new Faculty("Dr. Mehta");

        Enrollment e1 = new Enrollment(s1, java);
        Enrollment e2 = new Enrollment(s2, java);

        faculty.evaluateStudent(e1, "A");
        faculty.evaluateStudent(e2, "B");

        System.out.println("---------------");

        e1.printEnrollment();
        s1.printTranscript();

        System.out.println("---------------");

        e2.printEnrollment();
        s2.printTranscript();
    }
}
