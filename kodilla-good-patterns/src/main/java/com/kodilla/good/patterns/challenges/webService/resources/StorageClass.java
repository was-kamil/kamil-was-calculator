package com.kodilla.good.patterns.challenges.webService.resources;
import com.kodilla.good.patterns.challenges.webService.data.Order;


public class StorageClass implements StorageInterface {

    @Override
    public boolean save(Order order) {
        return false;
    }
}