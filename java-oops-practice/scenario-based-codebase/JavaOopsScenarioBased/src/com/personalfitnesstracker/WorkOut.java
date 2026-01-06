package com.personalfitnesstracker;

public abstract class WorkOut implements ITrackable {

    protected String type;
    protected int duration;   // minutes
    protected double caloriesBurned;

    public WorkOut(int duration) {
        this.duration = duration;
    }

    public abstract void calculateCalories();

    public double getCaloriesBurned() {
        return caloriesBurned;
    }

    @Override
    public void startWorkout() {
        System.out.println(type + " workout started...");
    }

    @Override
    public void stopWorkout() {
        System.out.println(type + " workout ended.");
    }

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public void setCaloriesBurned(double caloriesBurned) {
		this.caloriesBurned = caloriesBurned;
	}
    
}
