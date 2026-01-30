package com.avltree.gamingapp;

public class AVLNode {
    Player player;
    AVLNode left, right;
    int height;

    AVLNode(Player player) {
        this.player = player;
        height = 1;
    }
}