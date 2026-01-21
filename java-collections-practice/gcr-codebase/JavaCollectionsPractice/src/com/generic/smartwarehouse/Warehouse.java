package com.generic.smartwarehouse;

import java.util.List;

public class Warehouse {
    // UPPER BOUND (READ ONLY)
    public static void displayItems(List<? extends WarehouseItem> items) {

        System.out.println("\nDisplaying warehouse items:");

        for (WarehouseItem item : items) {
            item.display();
        }
    }

    // LOWER BOUND (WRITE ONLY)
    public static void addElectronics(
            List<? super Electronics> items) {

        items.add(new Electronics(201, "Laptop", 75000));
        items.add(new Electronics(202, "Mobile", 40000));

        System.out.println("\nElectronics added successfully.");
    }
}
