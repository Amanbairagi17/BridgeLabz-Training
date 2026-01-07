package com.digitalbookstoresystem;
import java.util.List;

public class Order {

    private String user;
    private List<Book> books;   // ONE order → MANY books
    private int quantity;       // same quantity for each book (simple case)
    private String status = "CREATED";

    public Order(String user, List<Book> books, int quantity) {
        this.user = user;
        this.books = books;
        this.quantity = quantity;
    }

    public void placeOrder() {

        double total = 0;
        double discount = 0;

        // check stock for all books
        for (Book book : books) {
            if (!book.reduceStock(quantity)) {
                status = "FAILED";
                System.out.println("Insufficient stock for book");
                return;
            }
        }

        // calculate total & discount
        for (Book book : books) {
            double bookTotal = book.getPrice() * quantity;
            total += bookTotal;
            discount += book.applyDiscount(bookTotal);
        }

        double finalAmount = total - discount;

        status = "CONFIRMED";
        System.out.println("Order Confirmed for " + user);
        System.out.println("Final Amount: ₹" + finalAmount);
    }
}

