package org.besidescollege.domain.account;

import java.util.Date;

import org.besidescollege.domain.library.BookItem;

public class Member extends Account {
    private Date dateOfMemebership;
    private int totalBooksCheckedout;

    public int getTotalBooksCheckoutOut() {
        return totalBooksCheckedout;
    }

    public boolean reserveBookItem(BookItem booItemm) {
        return true;
    }

    private void incrementTotalBooksCheckout(){};
}
