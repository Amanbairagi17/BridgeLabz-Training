package com.regex.smarthospitalinventorytracker;

public class MedicalItem extends Item<String> {

    public MedicalItem(String itemId,
                       String name,
                       int quantity,
                       String expiryDate,
                       String category) {

        super(itemId, name, quantity, expiryDate, category);
    }
}
