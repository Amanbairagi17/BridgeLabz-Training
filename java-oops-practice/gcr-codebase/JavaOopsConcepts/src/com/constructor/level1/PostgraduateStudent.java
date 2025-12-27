package com.constructor.level1;

public class PostgraduateStudent {
	public static void main(String[] args) {
		Student s = new Student("05Al23", "Ram",8.9);
		s.display();
		s.setCgpa(8.2);
		s.display();
	}
}
