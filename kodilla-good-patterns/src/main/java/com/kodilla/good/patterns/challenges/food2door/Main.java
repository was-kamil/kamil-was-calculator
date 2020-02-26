package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.data.Request;
import com.kodilla.good.patterns.challenges.food2door.service.*;
import com.kodilla.good.patterns.challenges.food2door.service.delivery.InMemoryDelivery;
import com.kodilla.good.patterns.challenges.food2door.service.status.InMemoryCheckOrder;


public class Main {
    public static void main(String[] args) {
        Request request = new RequestRetiever().retrieve();
        Request request2 = new RequestRetiever().retrieve2();
        Request request3 = new RequestRetiever().retrieve3();
        Request request4 = new RequestRetiever().retrieve4();
        Request request5 = new RequestRetiever().retrieve5();

        ShopProcessor shopProcessor = new ShopProcessor(new InMemoryCheckOrder(), new InMemoryDelivery());
        shopProcessor.process(request);
        shopProcessor.process(request2);
        shopProcessor.process(request3);
        shopProcessor.process(request4);
        shopProcessor.process(request5);
    }
}
