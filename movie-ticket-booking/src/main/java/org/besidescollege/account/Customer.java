package org.besidescollege.account;

import java.util.List;

import org.besidescollege.Booking.Booking;

public class Customer extends Person {
    public boolean makeBooking(Booking booking) {
        return true;
    }

    public List<Booking> getBookings() {
        return null;
    };
}
