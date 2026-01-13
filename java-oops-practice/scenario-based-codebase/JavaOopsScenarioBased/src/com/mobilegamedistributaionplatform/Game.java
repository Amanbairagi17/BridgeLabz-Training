package com.mobilegamedistributaionplatform;

public abstract class Game implements IDownloadable {

    protected String title;
    protected String genre;
    protected double price;
    protected double rating;

    // Free game constructor
    public Game(String title, String genre, double rating) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.price = 0;
    }

    // Paid game constructor
    public Game(String title, String genre, double price, double rating) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.rating = rating;
    }

    // Seasonal offer logic
    public void applySeasonalOffer(double discount) {
        price = price - discount;   // operator usage
    }

    @Override
    public void download() {
        System.out.println(title + " downloaded successfully");
    }
}
