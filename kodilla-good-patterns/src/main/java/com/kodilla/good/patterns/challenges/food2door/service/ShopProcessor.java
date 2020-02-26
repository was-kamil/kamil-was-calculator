package com.kodilla.good.patterns.challenges.food2door.service;

import com.kodilla.good.patterns.challenges.food2door.service.delivery.Delivery;
import com.kodilla.good.patterns.challenges.food2door.service.status.CheckOrder;
import com.kodilla.good.patterns.challenges.food2door.data.*;


public class ShopProcessor {
    private CheckOrder checkOrder;
    private Delivery delivery;

    public ShopProcessor(final CheckOrder checkOrder, final Delivery delivery) {
        this.checkOrder = checkOrder;
        this.delivery = delivery;
    }

    public BuyingDto process(final Request request) {
        boolean isOrderCorrect = checkOrder.checkOrder(request);

            if (isOrderCorrect) {
                boolean isDeliver = delivery.deliver(request);
            if (isDeliver) {
                System.out.println("---");
                System.out.println("The order has been completed.");
                System.out.println("============>  <============");
                return new BuyingDto(request.getUser(), true);
            }
            }

                System.out.println("---");
                System.out.println("============>  <============");
                return new BuyingDto(request.getUser(), false);
    }
}