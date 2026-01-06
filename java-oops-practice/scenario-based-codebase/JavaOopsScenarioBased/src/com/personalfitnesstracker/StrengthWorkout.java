package com.personalfitnesstracker;

public class StrengthWorkout extends WorkOut {

    public StrengthWorkout(int duration) {
        super(duration);
        this.type = "Strength";
    }

    @Override
    public void calculateCalories() {
        caloriesBurned = duration * 6;   // operator usage
    }
}

