package com.kodilla.good.patterns.challenges.webService.resources;
import com.kodilla.good.patterns.challenges.webService.data.Order;


public class InMemorySorage implements Storage {

    @Override
    public boolean save(Order order) {
        return false;
    }
}