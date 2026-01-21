package com.generic.personalizemealplanner;

public class Vegetarian implements MealPlan {

    public String getMealType() {
        return "Vegetarian";
    }

    public int getCalories() {
        return 1800;
    }

    public void showMeals() {
        System.out.println("Veg Meal: Paneer, Rice, Dal, Salad");
    }
}
