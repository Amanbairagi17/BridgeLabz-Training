package com.studentrankgenerator;

public class Student {
	private String name;
	private int score;
	
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}
	
	public String toString() {
		return "Student name : " +this.name + " Student score : "+ this.score;
		
	}
	
}
