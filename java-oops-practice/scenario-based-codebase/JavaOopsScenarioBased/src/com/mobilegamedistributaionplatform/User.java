package com.mobilegamedistributaionplatform;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String name;
    private List<Game> ownedGames;   // protected data

    public User(String name) {
        this.name = name;
        this.ownedGames = new ArrayList<>();
    }

    public void buyGame(Game game) {
        ownedGames.add(game);
        System.out.println(game.title + " added to library");
    }

    public void showLibrary() {
        System.out.println(name + "'s Games:");
        for (Game g : ownedGames) {
            System.out.println("- " + g.title);
        }
    }
}
