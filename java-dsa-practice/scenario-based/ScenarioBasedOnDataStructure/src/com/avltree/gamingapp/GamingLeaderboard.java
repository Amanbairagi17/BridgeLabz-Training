package com.avltree.gamingapp;

public class GamingLeaderboard {
	public static void main(String[] args) {

        AVLTree tree = new AVLTree();

        tree.insert(new Player("Aman", 450));
        tree.insert(new Player("Rohit", 900));
        tree.insert(new Player("Neha", 700));
        tree.insert(new Player("Kunal", 1000));
        tree.insert(new Player("Pooja", 850));

        tree.displayTopPlayers();
 
        System.out.println("\nPlayer banned (score 700)");
        tree.delete(700); 

        tree.displayTopPlayers();
    }
}
