package com.generic.smartwarehouse;

import java.util.ArrayList;
import java.util.List;

public class DriverClass {
	public static void main(String[] args) {

        //Electronics Storage
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics(1, "TV", 55000));
        electronicsStorage.addItem(new Electronics(2, "AC", 45000));

        //Grocery Storage 
        Storage<Groceries> groceryStorage = new Storage<>();
        groceryStorage.addItem(new Groceries(3, "Rice", 1200));
        groceryStorage.addItem(new Groceries(4, "Oil", 1800));

        //  Furniture Storage 
        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture(5, "Chair", 3000));
        furnitureStorage.addItem(new Furniture(6, "Table", 7000));

        // UPPER BOUND DEMO (READ)
        Warehouse.displayItems(electronicsStorage.getItems());
        Warehouse.displayItems(groceryStorage.getItems());
        Warehouse.displayItems(furnitureStorage.getItems());

        // LOWER BOUND DEMO (WRITE)
        List<WarehouseItem> commonStorage = new ArrayList<>();

        Warehouse.addElectronics(commonStorage);

        // display again
        Warehouse.displayItems(commonStorage);
    }
}
