package com.inheritance.assitedproblems.employeemanagement;

public class Manager extends Employee{
	//Attributes
	private int teamSize;
	
	// constructor
	public Manager(int id, String name, int salary, int teamSize) {
		super(id, name, salary);
		this.teamSize = teamSize;
	}

	// getter and setter
	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
}
