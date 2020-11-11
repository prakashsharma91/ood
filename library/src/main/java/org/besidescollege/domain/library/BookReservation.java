package org.besidescollege.domain.library;

import java.lang.reflect.Member;
import java.util.Date;

public class BookReservation {
    BookItem bookItem;
    Member issuedBy;
    Date creationDate;
    ReservationStatus reservationStatus;
}
