package com.dailystepcountranking;

public class Person {
	private String name;
	private int stepCount;
	
	//constructor
	public Person(String name, int stepCount) {
		super();
		this.name = name;
		this.stepCount = stepCount;
	}

	//getters
	public String getName() {
		return name;
	}

	public int getStepCount() {
		return stepCount;
	}

	@Override
	public String toString() {
		return "Person [name : " + name + ", stepCount : " + stepCount + "]";
	}
}
