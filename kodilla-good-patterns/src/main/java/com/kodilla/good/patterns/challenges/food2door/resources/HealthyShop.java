package com.kodilla.good.patterns.challenges.food2door.resources;
import com.kodilla.good.patterns.challenges.food2door.data.*;
import java.util.HashMap;
import java.util.Map;


public class HealthyShop implements Supplier {

    private Map<String, Boolean> deliverPossibility = new HashMap<>();

    public HealthyShop() {
        deliverPossibility.put("Warsaw", true);
        deliverPossibility.put("Krakow", true);
        deliverPossibility.put("Gdansk", false);
        deliverPossibility.put("Gdynia", false);
    }

    private boolean checkDeliverPossibility(User user) {
        return deliverPossibility.get(user.getCity());
    }

    @Override
    public boolean process(Request request) {

        boolean deliveryPossibility = this.checkDeliverPossibility(request.getUser());

            if (deliveryPossibility) {
                System.out.println("Possible to realize " + request.getOrder().getProductName());
                return true;
            } else {
                System.out.println("Impossible to realize " + request.getUser().getCity());
                return false;
            }
    }

    @Override
    public String toString() {
        return "HealthyShop";
    }
}