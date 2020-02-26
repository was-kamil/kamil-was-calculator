package com.kodilla.good.patterns.challenges.webService.resources;
import com.kodilla.good.patterns.challenges.webService.data.Order;


public interface Storage {

    boolean save(Order order);

}