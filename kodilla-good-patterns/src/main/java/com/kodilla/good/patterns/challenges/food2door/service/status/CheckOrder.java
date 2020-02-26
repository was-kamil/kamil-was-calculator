package com.kodilla.good.patterns.challenges.food2door.service.status;
import com.kodilla.good.patterns.challenges.food2door.data.Request;


public interface CheckOrder {
    boolean checkOrder(Request request);
}