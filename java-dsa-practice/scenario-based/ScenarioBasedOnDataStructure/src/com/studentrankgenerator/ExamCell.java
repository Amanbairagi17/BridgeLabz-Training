package com.studentrankgenerator;

import java.util.Arrays;

public class ExamCell {
	public static void main(String[] args) {
		Student[] students = {
				new Student("Aman", 85),
			    new Student("Rohit", 72),
			    new Student("Neha", 90),
			    new Student("Priya", 78),
			    new Student("Karan", 65),
			    new Student("Anjali", 88),
			    new Student("Vikas", 70),
			    new Student("Sneha", 92),
			    new Student("Rahul", 60),
			    new Student("Pooja", 80)
		};
		
		SortScore score = new SortScore(students);
		System.out.println("Score before sorting : ");
		for(Student student : students) {
			System.out.println(student);
		}
		score.sortScore();
		System.out.println("Score after sorting : ");
		for(Student student : students) {
			System.out.println(student);
		}
		
	
	}
}
