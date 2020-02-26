package com.kodilla.good.patterns.challenges.food2door.data;

public class BuyingDto {
    private User user;
    private boolean isDelivered;

    public BuyingDto(User user, boolean isDelivered) {
        this.user = user;
        this.isDelivered = isDelivered;
    }

    public User getUser() {
        return user;
    }
}