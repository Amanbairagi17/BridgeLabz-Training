package com.personalfitnesstracker;

public class UserProfile {

    private String name;
    private int age;
    private double weight;   // sensitive health data
    private String goal;
    private double dailyCalorieTarget;

    // Default goal constructor
    public UserProfile(String name, int age, double weight) {
        this(name, age, weight, "Maintain Fitness");
    }

    // Custom goal constructor
    public UserProfile(String name, int age, double weight, String goal) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.goal = goal;
        calculateDailyTarget();
    }

    private void calculateDailyTarget() {
        dailyCalorieTarget = weight * 30; // operator usage
    }

    public double getDailyCalorieTarget() {
        return dailyCalorieTarget;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getGoal() {
		return goal;
	}

	public void setGoal(String goal) {
		this.goal = goal;
	}

	public void setDailyCalorieTarget(double dailyCalorieTarget) {
		this.dailyCalorieTarget = dailyCalorieTarget;
	}

    
}
