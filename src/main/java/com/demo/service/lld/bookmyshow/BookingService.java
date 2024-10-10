package com.demo.service.lld.bookmyshow;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class BookingService {
    private final List<Booking> bookings;

    public BookingService() {
        this.bookings = new ArrayList<>();
    }

    public Booking bookSeat(Show show, int seatNumber) {
        for (Seat seat : show.getSeats()) {
            if (seat.getSeatNumber() == seatNumber && !seat.isBooked()) {
                seat.book();
                Booking booking = new Booking(show, seat, LocalDateTime.now());
                bookings.add(booking);
                return booking;
            }
        }
        return null;
    }

    public void cancelBooking(Booking booking) {
        booking.getSeat().cancel();
        bookings.remove(booking);
    }

    public List<Booking> getBookings() {
        return bookings;
    }
}