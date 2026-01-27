package com.tree.songmusicapp;

public class MuaicApp {
	public static void main(String[] args) {

        Tree tree = new Tree();

        // insert song
        tree.insert(new Song(301, "Believer", "Imagine Dragons"));
        tree.insert(new Song(205, "Shape of You", "Ed Sheeran"));
        tree.insert(new Song(410, "Alone", "Alan Walker"));
        tree.insert(new Song(150, "Counting Stars", "OneRepublic"));
        tree.insert(new Song(390, "Thunder", "Imagine Dragons"));

        // display playlist alphabetically
        tree.displayPlaylist();

        // search by track ID
        System.out.println("\nSearching Track ID 205:");
        Song s = tree.searchByTrackId(205);

        if (s != null)
            System.out.println(
                    s.title + " - " + s.artist + " (ID: " + s.trackId + ")"
            );
        else
            System.out.println("Track not found");
    }
}
