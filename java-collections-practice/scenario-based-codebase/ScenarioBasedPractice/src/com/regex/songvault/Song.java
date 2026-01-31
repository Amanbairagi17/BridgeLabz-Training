package com.regex.songvault;

public class Song extends Media<String> {

    public Song(String title,
                String artist,
                String duration,
                String genre) {

        super(title, artist, duration, genre);
    }

	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", duration=" + duration + ", genre=" + genre + "]";
	}
   
}
