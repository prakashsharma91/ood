package org.besidecollege.card;

import java.util.Date;

import org.besidecollege.account.Account;

public class Card {
    String number;
    String pin;
    String cvv;
    Date expiry;

    Account cardHolder;

    public double getBalance() {
        return 0.0;
    }

    public boolean deposit(double amount) {
        return false;
    }

    public boolean withdraw(double amount) {
        return false;
    }
}
