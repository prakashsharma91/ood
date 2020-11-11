package org.besidescollege.domain.account;

import java.util.List;

import org.besidescollege.domain.payment.CreditCard;
import org.besidescollege.domain.payment.ETransfer;

public abstract class Account {
    String name;
    String userName;
    String password;
    String email;
    String phone;
    Address shippingAddress;
    AccountStatus accountStatus;

    List<CreditCard> creditCards;
    List<ETransfer> eTransfers;

    public boolean resetPassword() {
        return false;
    };

    public int getAvailableCount() {
        return 0;
    }

    public boolean updatePrice(Double price) {
        return true;
    }
}
