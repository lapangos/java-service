package com.demo.service.lld.bookmyshow;

import java.time.LocalDateTime;

public class Booking {
    private final Show show;
    private final Seat seat;
    private final LocalDateTime bookingTime;

    public Booking(Show show, Seat seat, LocalDateTime bookingTime) {
        this.show = show;
        this.seat = seat;
        this.bookingTime = bookingTime;
    }

    public Show getShow() {
        return show;
    }

    public Seat getSeat() {
        return seat;
    }

    public LocalDateTime getBookingTime() {
        return bookingTime;
    }
}