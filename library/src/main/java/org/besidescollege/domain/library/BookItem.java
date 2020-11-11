package org.besidescollege.domain.library;

import java.util.Date;

public class BookItem extends Book {
    private String barcode;
    private boolean isReferenceOnly;
    private Date borrowed;
    private Date dueDate;
    private double price;
    private BookFormat format;
    private BookStatus status;
    private Date dateOfPurchase;
    private Date publicationDate;
    private Rack placedAt;

    public boolean checkout(String memberId) {
        if (isReferenceOnly) {
            // ShowError("This book is Reference only and can't be issued");
            return false;
        }
        if (!BookLending.lendBook(barcode, memberId)) {
            return false;
        }
        status = BookStatus.LOANDED;
        return true;
    }
}
