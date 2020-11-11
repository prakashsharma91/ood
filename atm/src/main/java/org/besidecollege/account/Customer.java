package org.besidecollege.account;

import org.besidecollege.card.Card;
import org.besidecollege.transaction.Transaction;

public class Customer {
    private String name;
    private String email;
    private String phone;
    private String address;
    private CustomerStatus status;

    private Card card;
    private Account account;

    public boolean makeTransaction(Transaction transaction) {
        return false;
    };
}
