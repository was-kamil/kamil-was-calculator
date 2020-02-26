package com.kodilla.good.patterns.challenges.food2door.resources;
import com.kodilla.good.patterns.challenges.food2door.data.Request;


public interface Supplier {
    boolean process(Request request);
}
