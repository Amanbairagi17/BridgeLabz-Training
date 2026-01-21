package com.generic.dynamiconlinemarketplace;

public class MarketPlaceApp {
    public static void main(String[] args) {

        ProductCatalog catalog = new ProductCatalog();

        Book book = new Book(
                "Java Mastery",
                1500,
                BookCategory.EDUCATION);

        Clothing shirt = new Clothing(
                "Denim Shirt",
                2500,
                ClothingCategory.MEN);

        Gadget phone = new Gadget(
                "iPhone 15",
                80000,
                GadgetCategory.MOBILE);

        catalog.addProduct(book);
        catalog.addProduct(shirt);
        catalog.addProduct(phone);

        System.out.println("Before Discout : ");
        catalog.showCatalog();

        DiscountService.applyDiscount(book, 10);
        DiscountService.applyDiscount(shirt, 20);
        DiscountService.applyDiscount(phone, 5);

        System.out.println("After Discount : ");
        catalog.showCatalog();
    }
}
