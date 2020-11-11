package org.besidescollege.Booking;

import java.util.Date;
import java.util.List;

import org.besidescollege.hall.Seat;
import org.besidescollege.movie.Show;

public class Booking {
    private String bookingNumber;
    private int numberOfSeats;
    private Date createdOn;
    private BookingStatus status;

    private Show show;
    private List<Seat> seats;
    private Payment payment;

    public boolean makePayment(Payment payment) {
        return true;
    }

    public boolean cancel() {
        return true;
    }

    public boolean assignSeats(List<Seat> seats) {
        return true;
    }
}
