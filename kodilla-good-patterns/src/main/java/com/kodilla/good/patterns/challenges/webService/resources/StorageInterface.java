package com.kodilla.good.patterns.challenges.webService.resources;
import com.kodilla.good.patterns.challenges.webService.data.Order;


public interface StorageInterface {

    boolean save(Order order);

}