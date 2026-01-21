package com.generic.personalizemealplanner;

public class Meal<T extends MealPlan> {

    private T mealPlan;

    public Meal(T mealPlan) {
        this.mealPlan = mealPlan;
    }

    public T getMealPlan() {
        return mealPlan;
    }

    public void displayMealPlan() {
        System.out.println("Meal Type: " + mealPlan.getMealType());
        System.out.println("Calories : " + mealPlan.getCalories());
        mealPlan.showMeals();
    }
}
