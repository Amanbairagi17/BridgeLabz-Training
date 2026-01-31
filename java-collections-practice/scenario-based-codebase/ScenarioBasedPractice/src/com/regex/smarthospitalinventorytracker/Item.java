package com.regex.smarthospitalinventorytracker;

public abstract class Item<T> {

    protected String itemId;
    protected String name;
    protected int quantity;
    protected String expiryDate;
    protected T category;

    public Item(String itemId, String name,
                int quantity, String expiryDate,
                T category) {

        this.itemId = itemId;
        this.name = name;
        this.quantity = quantity;
        this.expiryDate = expiryDate;
        this.category = category;
    }

    public String getItemId() {
        return itemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public T getCategory() {
        return category;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Item))
            return false;

        Item<?> other = (Item<?>) obj;
        return this.itemId.equals(other.itemId);
    }

    @Override
    public int hashCode() {
        return itemId.hashCode();
    }

    @Override
    public String toString() {
        return itemId + " | " + name +
                " | Qty=" + quantity +
                " | Exp=" + expiryDate;
    }
}
