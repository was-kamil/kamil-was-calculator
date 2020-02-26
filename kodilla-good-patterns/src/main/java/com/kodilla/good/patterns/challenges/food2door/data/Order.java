package com.kodilla.good.patterns.challenges.food2door.data;

public class Order {
    private String productName;
    private int amount;
    private double price;

    public Order(String productName, int amount, double price) {
        this.productName = productName;
        this.amount = amount;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }
}
