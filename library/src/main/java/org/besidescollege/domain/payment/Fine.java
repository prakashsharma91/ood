package org.besidescollege.payment;

import java.lang.reflect.Member;
import java.util.Date;

import org.besidescollege.domain.library.BookItem;

public class Fine {
    Member user;
    Date date;
    BookItem bookItem;

    public static void collectFine(String memberId, long days) {
    }
}
