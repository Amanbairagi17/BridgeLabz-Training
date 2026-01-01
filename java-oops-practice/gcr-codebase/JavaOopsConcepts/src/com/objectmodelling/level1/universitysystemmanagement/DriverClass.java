package com.objectmodelling.level1.universitysystemmanagement;

public class DriverClass {
	public static void main(String[] args) {
		Student student = new Student(1, "student name");

		Professor professor = new Professor(1, "professor name");

		Course course = new Course("Object Oriented Programming");

		course.assignProfessor(professor);

		student.enrollCourse(course);
//		System.out.println(student);
//		System.out.println(course);
//		System.out.println(professor);
	}
}
