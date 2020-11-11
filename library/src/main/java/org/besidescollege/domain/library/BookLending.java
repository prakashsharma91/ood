package org.besidescollege.domain.library;

import java.util.Date;

public class BookLending {
    private Date creationDate;
    private Date dueDate;
    private Date returnDate;
    private String bookItemBarcode;
    private String memeberId;

    public static void lendBook(String barcode, String memberId) {
    }

    public static BookLending fetchLendingDetails(String barcode) {
        return null;
    }
}
