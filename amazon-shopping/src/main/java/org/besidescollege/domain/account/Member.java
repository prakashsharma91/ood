package org.besidescollege.domain.account;

import org.besidescollege.domain.order.Order;
import org.besidescollege.domain.order.OrderStatus;

public class Member extends Customer {
    private Account account;

    public OrderStatus placeOrder(Order order) {
        return OrderStatus.COMPLETED;
    };

}
