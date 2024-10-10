package com.demo.service.lld.bookmyshow;

public class Movie {
    private final String title;
    private final String genre;
    private final int duration; // in minutes

    public Movie(String title, String genre, int duration) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getDuration() {
        return duration;
    }
}