package com.tree.songmusicapp;

public class TreeNode {

    Song song;
    TreeNode left;
    TreeNode right;

    TreeNode(Song song) {
        this.song = song;
        this.left = null;
        this.right = null;
    }
}
