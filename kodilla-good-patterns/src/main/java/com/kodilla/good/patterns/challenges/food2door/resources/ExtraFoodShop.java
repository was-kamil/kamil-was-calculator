package com.kodilla.good.patterns.challenges.food2door.resources;
import com.kodilla.good.patterns.challenges.food2door.data.Request;


public class ExtraFoodShop implements Supplier {

    @Override
    public boolean process(Request request) {
        System.out.println("Request retrieved.");
        System.out.println("Checking stock of product.");
        System.out.println("Checking price.");
        return true;
    }

    @Override
    public String toString() {
        return "ExtraFoodShop";
    }
}