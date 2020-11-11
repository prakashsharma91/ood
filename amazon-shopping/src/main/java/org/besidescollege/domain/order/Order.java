package org.besidescollege.domain.order;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.besidescollege.domain.payment.PaymentStatus;
import org.besidescollege.domain.product.Product;

public class Order {
    private String orderNumber;
    private OrderStatus status;
    private Date orderDate;
    private List<OrderLog> orderLog;

    public boolean sendForShipment() {
        return true;
    };

    public boolean makePayment(Payment payment) {
        return true;
    };

    public boolean addOrderLog(OrderLog orderLog) {
        return true;
    };
}
