package com.generic.dynamiconlinemarketplace;

class Book extends Product<BookCategory> {

    public Book(String name, double price, BookCategory category) {
        super(name, price, category);
    }

    public double minPrice() {
        return 100;
    }

    public double maxPrice() {
        return 2000;
    }
}
