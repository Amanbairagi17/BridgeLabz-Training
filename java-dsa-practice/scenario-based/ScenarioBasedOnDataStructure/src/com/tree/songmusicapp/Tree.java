package com.tree.songmusicapp;

public class Tree {
	private TreeNode root;

    //insert node
    public void insert(Song song) {
        root = insertRec(root, song);
    }

    private TreeNode insertRec(TreeNode root, Song song) {

        if (root == null)
            return new TreeNode(song);

        // BST based on song title (alphabetical order)
        if (song.title.compareToIgnoreCase(root.song.title) < 0)
            root.left = insertRec(root.left, song);

        else if (song.title.compareToIgnoreCase(root.song.title) > 0)
            root.right = insertRec(root.right, song);

        return root;
    }

    //search track by title id
    public Song searchByTrackId(int trackId) {
        return searchIdRec(root, trackId);
    }

    private Song searchIdRec(TreeNode root, int trackId) {

        if (root == null)
            return null;

        if (root.song.trackId == trackId)
            return root.song;

        Song left = searchIdRec(root.left, trackId);
        if (left != null) return left;

        return searchIdRec(root.right, trackId);
    }

    //display playlist alphabetical
    public void displayPlaylist() {
        System.out.println("Playlist (Alphabetical Order):");
        inorder(root);
    }

    private void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.println(
                    root.song.title + " - " +
                    root.song.artist +
                    " (ID: " + root.song.trackId + ")"
            );
            inorder(root.right);
        }
    }
}
