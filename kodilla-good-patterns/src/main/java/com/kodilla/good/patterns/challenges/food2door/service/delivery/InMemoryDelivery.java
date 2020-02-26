package com.kodilla.good.patterns.challenges.food2door.service.delivery;
import com.kodilla.good.patterns.challenges.food2door.data.Request;


public class InMemoryDelivery implements Delivery {

    @Override
    public boolean deliver(Request request) {
        System.out.println("---");
        System.out.println("Sending delivery request to chosen supplier: " + request.getSupplier().toString());
        boolean isDeliver = request.getSupplier().process(request);
        return isDeliver;
    }
}