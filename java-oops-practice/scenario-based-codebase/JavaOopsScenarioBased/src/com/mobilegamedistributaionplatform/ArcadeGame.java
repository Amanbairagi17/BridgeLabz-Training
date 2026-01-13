package com.mobilegamedistributaionplatform;

public class ArcadeGame extends Game {

    public ArcadeGame(String title, double price, double rating) {
        super(title, "Arcade", price, rating);
    }

    @Override
    public void playDemo() {
        System.out.println("Playing fast-paced arcade demo of " + title);
    }
}
