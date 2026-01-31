package com.regex.songvault;

public abstract class Media<T> {

    protected String title;
    protected String artist;
    protected String duration;
    protected T genre;

    public Media(String title, String artist,
                 String duration, T genre) {

        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getDuration() {
        return duration;
    }

    public T getGenre() {
        return genre;
    }
}
