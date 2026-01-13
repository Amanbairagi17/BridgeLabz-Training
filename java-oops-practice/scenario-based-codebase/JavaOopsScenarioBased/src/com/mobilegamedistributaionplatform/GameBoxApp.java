package com.mobilegamedistributaionplatform;

public class GameBoxApp {
    public static void main(String[] args) {

        User user = new User("Aman");

        Game game1 = new ArcadeGame("Speed Racer", 299, 4.5);
        Game game2 = new StrategyGame("War Planner", 499, 4.7);

        game1.playDemo();
        game2.playDemo();

        game1.applySeasonalOffer(50); // discount

        user.buyGame(game1);
        user.buyGame(game2);

        game1.download();
        game2.download();

        user.showLibrary();
    }
}
