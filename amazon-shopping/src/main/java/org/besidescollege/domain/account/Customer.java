package org.besidescollege.domain.account;

import org.besidescollege.domain.cart.Cart;
import org.besidescollege.domain.order.Order;
import org.besidescollege.domain.product.Product;

public abstract class Customer {
    private Cart car;
    private Order order;

    public Cart getCart() {
        return null;
    };

    private boolean addItemToCart(Product product) {
        return true;
    };

    private boolean removeItemFromCart(Product product) {
        return true;
    }
}
