package com.generic.personalizemealplanner;

public class Vegan implements MealPlan {

    public String getMealType() {
        return "Vegan";
    }

    public int getCalories() {
        return 1600;
    }

    public void showMeals() {
        System.out.println("Vegen Meal: Tofu, Quinoa, Vegetables");
    }
}
