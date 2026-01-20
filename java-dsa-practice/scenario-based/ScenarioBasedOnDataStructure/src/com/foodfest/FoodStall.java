package com.foodfest;

public class FoodStall {
    private String stallName;
    private int footfall;

    // constructor
    public FoodStall(String stallName, int footfall) {
        this.stallName = stallName;
        this.footfall = footfall;
    }

    public String getStallName() {
        return stallName;
    }

    public int getFootfall() {
        return footfall;
    }

    @Override
    public String toString() {
        return "Stall : " +stallName + " :" + footfall;
    }
}
