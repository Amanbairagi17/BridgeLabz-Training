package com.personalfitnesstracker;

public class CardioWorkout extends WorkOut {

    public CardioWorkout(int duration) {
        super(duration);
        this.type = "Cardio";
    }

    @Override
    public void calculateCalories() {
        caloriesBurned = duration * 8;   // operator usage
    }
}
