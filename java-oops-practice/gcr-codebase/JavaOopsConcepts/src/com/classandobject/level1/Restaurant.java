package com.classandobject.level1;

public class Restaurant {
 // Fields (Attributes)
    private String name;
    private String location;
    private String[] foodItems;

    // Constructor
    public Restaurant(String name, String location, String[] foodItems) {
        this.name = name;
        this.location = location;
        this.foodItems = foodItems;
    }

    // Method to display restaurant details
    public void displayDetails() {
        System.out.println("Restaurant Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Food Items: ");
        for (String item : foodItems) {
            System.out.println("- " + item);
        }
    }

    // Method to check if a food item is available
    public boolean isFoodAvailable(String food) {
        for (String item : foodItems) {
            if (item.equalsIgnoreCase(food)) {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
    	Restaurant r = new Restaurant("One Bite","Indrpuri" ,new String[]{"Piza","Milk"});
    	r.displayDetails();
    	System.out.print("Pav is available : " +r.isFoodAvailable("Pav"));
    }
}
