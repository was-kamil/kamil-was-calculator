package com.kodilla.good.patterns.challenges.food2door.service.status;
import com.kodilla.good.patterns.challenges.food2door.data.Request;


public class InMemoryCheckOrder implements CheckOrder {

    @Override
    public boolean checkOrder(Request request) {
        System.out.println("\nChecking order for " + request.getUser().getName() + " " + request.getUser().getSurname() + "...");
        System.out.println("Order: " + request.getOrder().getProductName() +
                ", quantity: " + request.getOrder().getAmount() + ", price: " + request.getOrder().getPrice());
        System.out.println("Supplier: " + request.getSupplier());
        System.out.println("Order correct.");
        return true;
    }
}
