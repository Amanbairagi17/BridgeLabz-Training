package com.virtualpetapplication;

import java.util.Scanner;

public class PetPalApp {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Pet Type:");
        System.out.println("1. Dog");
        System.out.println("2. Cat");
        System.out.println("3. Bird");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Pet Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Pet Age: ");
        int age = sc.nextInt();

        Pet pet;

        switch (choice) {
            case 1 -> pet = new Dog(name, age);
            case 2 -> pet = new Cat(name, age);
            case 3 -> pet = new Bird(name, age);
            default -> {
                System.out.println("Invalid choice!");
                return;
            }
        }

        System.out.println("\nPet Adopted Successfully!");
        pet.makeSound();
        pet.showStatus();

        boolean running = true;

        while (running) {
            System.out.println("\nChoose Action:");
            System.out.println("1. Feed");
            System.out.println("2. Play");
            System.out.println("3. Sleep");
            System.out.println("4. Exit");

            int action = sc.nextInt();

            switch (action) {
                case 1 -> pet.feed();
                case 2 -> pet.play();
                case 3 -> pet.sleep();
                case 4 -> running = false;
                default -> System.out.println("Invalid action");
            }

            pet.showStatus();
        }

        System.out.println("Thanks for using PetPal!");
        sc.close();
    }
}
