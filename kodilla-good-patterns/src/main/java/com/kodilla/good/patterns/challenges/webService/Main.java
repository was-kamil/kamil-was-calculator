package com.kodilla.good.patterns.challenges.webService;

import com.kodilla.good.patterns.challenges.webService.data.*;
import com.kodilla.good.patterns.challenges.webService.resources.*;
import com.kodilla.good.patterns.challenges.webService.service.*;


public class Main {

    public static void main(String[] args) {
        Product product = new Product("Coat", 1002, 50.99, Category.FASION);
        OrderDto orderDto = new OrderDto(product, 10);

        ProductOrderClass productOrderClass = new ProductOrderClass(new ProductDetailClass(), new InMemoryStorage());
        productOrderClass.order(orderDto);
    }
}
