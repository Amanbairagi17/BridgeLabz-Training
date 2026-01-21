package com.generic.personalizemealplanner;

public class MealApp {
    public static void main(String[] args) {

        Meal<Vegetarian> vegMeal =
                MealGenerator.generateMealPlan(
                        new Vegetarian());

        Meal<Vegan> veganMeal =
                MealGenerator.generateMealPlan(
                        new Vegan());

        Meal<HighProtien> proteinMeal =
                MealGenerator.generateMealPlan(
                        new HighProtien());

        vegMeal.displayMealPlan();
        System.out.println();

        veganMeal.displayMealPlan();
        System.out.println();

        proteinMeal.displayMealPlan();
    }
}
