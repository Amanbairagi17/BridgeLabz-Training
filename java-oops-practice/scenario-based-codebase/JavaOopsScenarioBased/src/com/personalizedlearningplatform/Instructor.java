package com.personalizedlearningplatform;

public class Instructor extends User{

	public Instructor(String name, int id, String email) {
		super(name, id, email);
	}

	@Override
	public void printDetail() {
		System.out.println("Instructor class");
	}
}
