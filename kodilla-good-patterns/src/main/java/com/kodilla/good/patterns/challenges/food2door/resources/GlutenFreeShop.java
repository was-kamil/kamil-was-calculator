package com.kodilla.good.patterns.challenges.food2door.resources;
import com.kodilla.good.patterns.challenges.food2door.data.*;


public class GlutenFreeShop implements Supplier {

    private static final int flourOnEUROPallet = 21;

    private boolean checkStore(Order order) {
        return flourOnEUROPallet >= order.getAmount();
    }

    @Override
    public boolean process(Request request) {

            if (this.checkStore(request.getOrder())) {
                System.out.println("Checking for scan of cargo document " + request.getUser().getPhone());
                System.out.println("Possible to realize " + request.getUser().getCity());
                return true;
            } else {
                System.out.println("Impossible to realize.");
                return false;
            }
    }

    @Override
    public String toString() {
        return "GlutenFreeShop";
    }
}
