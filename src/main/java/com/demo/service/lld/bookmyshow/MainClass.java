package com.demo.service.lld.bookmyshow;

import java.time.LocalDateTime;
import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        Movie movie = new Movie("Inception", "Sci-Fi", 148);
        Seat seat1 = new Seat(1);
        Seat seat2 = new Seat(2);
        Show show = new Show(movie, LocalDateTime.now().plusDays(1), Arrays.asList(seat1, seat2));
        Theater theater = new Theater("PVR Cinemas", "Downtown", Arrays.asList(show));

        BookingService bookingService = new BookingService();

        Booking booking1 = bookingService.bookSeat(show, 1);
        if (booking1 != null) {
            System.out.println("Booking successful for seat " + booking1.getSeat().getSeatNumber());
        } else {
            System.out.println("Booking failed");
        }

        Booking booking2 = bookingService.bookSeat(show, 2);
        if (booking2 != null) {
            System.out.println("Booking successful for seat " + booking2.getSeat().getSeatNumber());
        } else {
            System.out.println("Booking failed");
        }

        bookingService.cancelBooking(booking1);
        System.out.println("Booking for seat " + booking1.getSeat().getSeatNumber() + " cancelled");
    }
}