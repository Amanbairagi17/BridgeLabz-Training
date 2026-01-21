package com.generic.personalizemealplanner;

public class MealGenerator {
    public static <T extends MealPlan>
    Meal<T> generateMealPlan(T plan) {

        validate(plan);
        return new Meal<>(plan);
    }

    private static <T extends MealPlan>
    void validate(T plan) {

        if (plan.getCalories() < 1200 ||
            plan.getCalories() > 3000) {

            throw new IllegalArgumentException(
                "Invalid calorie range for meal plan");
        }
    }
}
