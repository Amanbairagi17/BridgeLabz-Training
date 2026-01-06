package com.personalfitnesstracker;

import java.util.Scanner;
public class FitTrackApplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Weight (kg): ");
        double weight = sc.nextDouble();
        sc.nextLine(); // consume newline

        System.out.print("Enter Fitness Goal (press Enter for default): ");
        String goal = sc.nextLine();

        UserProfile user;
        if (goal.isEmpty()) {
            user = new UserProfile(name, age, weight);
        } else {
            user = new UserProfile(name, age, weight, goal);
        }

        // Workout choice
        System.out.println("\nChoose Workout Type:");
        System.out.println("1. Cardio");
        System.out.println("2. Strength");
        int choice = sc.nextInt();

        System.out.print("Enter Workout Duration (minutes): ");
        int duration = sc.nextInt();

        WorkOut workout;
        if (choice == 1) {
            workout = new CardioWorkout(duration);
        } else {
            workout = new StrengthWorkout(duration);
        }

        // Tracking
        workout.startWorkout();
        workout.calculateCalories();
        workout.stopWorkout();

        double remainingCalories =
                user.getDailyCalorieTarget() - workout.getCaloriesBurned();

        System.out.println("\n--- Daily Progress ---");
        System.out.println("User: " + user.getName());
        System.out.println("Calories Burned: " + workout.getCaloriesBurned());
        System.out.println("Remaining Calories Target: " + remainingCalories);

        sc.close();
    }
}
