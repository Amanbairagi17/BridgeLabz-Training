package com.campusconnect;

public abstract class Person {
	//arrtibutes
	private String id;
	private String name;
	private String email;
	
	//Constructor
	public Person(String name, String email, String id) {
		
		this.id = id;
		this.name = name;
		this.email = email;
	}

	//getters and setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public abstract void printDetails();
	
}
