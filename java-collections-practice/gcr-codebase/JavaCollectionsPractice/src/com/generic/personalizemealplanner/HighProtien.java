package com.generic.personalizemealplanner;

public class HighProtien implements MealPlan {

    public String getMealType() {
        return "Protien";
    }

    public int getCalories() {
        return 2100;
    }

    public void showMeals() {
        System.out.println("High Protien Meal : Eggs, Milk, Panner ");
    }
}
