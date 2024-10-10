package com.demo.service.lld.bookmyshow;

import java.time.LocalDateTime;
import java.util.List;

public class Show {
    private final Movie movie;
    private final LocalDateTime showTime;
    private final List<Seat> seats;

    public Show(Movie movie, LocalDateTime showTime, List<Seat> seats) {
        this.movie = movie;
        this.showTime = showTime;
        this.seats = seats;
    }

    public Movie getMovie() {
        return movie;
    }

    public LocalDateTime getShowTime() {
        return showTime;
    }

    public List<Seat> getSeats() {
        return seats;
    }
}