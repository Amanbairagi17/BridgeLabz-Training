package com.generic.dynamiconlinemarketplace;

public class DiscountService {
	public static <T extends Product<?>> void applyDiscount(
            T product, double percentage) {

        double discount = product.getPrice() * percentage / 100;
        double newPrice = product.getPrice() - discount;

        if (newPrice >= product.minPrice() &&
            newPrice <= product.maxPrice()) {

            product.setPrice(newPrice);
        } else {
            System.out.println("Discount violates price range.");
        }
    }
}
