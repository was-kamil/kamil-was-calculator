package com.kodilla.good.patterns.challenges.food2door.data;
import com.kodilla.good.patterns.challenges.food2door.resources.Supplier;


public class Request {
    private User user;
    private Supplier supplier;
    private Order order;

    public Request(User user, Supplier supplier, Order order) {
        this.user = user;
        this.supplier = supplier;
        this.order = order;
    }

    public User getUser() {
        return user;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Order getOrder() {
        return order;
    }
}
