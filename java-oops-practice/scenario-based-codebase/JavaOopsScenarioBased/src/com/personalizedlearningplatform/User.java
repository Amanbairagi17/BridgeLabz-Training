package com.personalizedlearningplatform;

public abstract class User {
	private String name;
	private int id;
	private String email;
	
	public User(String name, int id, String email) {
		this.name = name;
		this.id = id;
		this.email = email;
	}

	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public abstract void printDetail();
	
	

}
