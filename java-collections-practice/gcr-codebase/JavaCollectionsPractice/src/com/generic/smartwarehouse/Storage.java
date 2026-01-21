package com.generic.smartwarehouse;

import java.util.ArrayList;
import java.util.List;

public class Storage<T extends WarehouseItem> {//Uses bounded type parameter -> use only ware house properties
	private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }
}
