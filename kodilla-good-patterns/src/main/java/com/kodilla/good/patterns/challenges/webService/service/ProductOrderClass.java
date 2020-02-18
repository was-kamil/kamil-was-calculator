package com.kodilla.good.patterns.challenges.webService.service;

import com.kodilla.good.patterns.challenges.webService.data.*;
import com.kodilla.good.patterns.challenges.webService.resources.StorageInterface;


public class ProductOrderClass implements ProductOrderService {

    private final ProductDetailService productDetailService;
    private final StorageInterface storageInterface;

    public ProductOrderClass(ProductDetailService productDetailService, StorageInterface storageInterface) {
        this.productDetailService = productDetailService;
        this.storageInterface = storageInterface;
    }

    @Override
    public void order(OrderDto orderDto) {
        Product product = productDetailService.findProduct(orderDto.getProduct().getProductID());

        if(orderDto.getQuantity() > 0) {
            double totalPrice = orderDto.getQuantity() * product.getProductCost();
            storageInterface.save(new Order(product, orderDto.getQuantity(), totalPrice));

            System.out.println("ORDER ACCEPTED");
        } else {
            System.out.println("ORDER REJECTED");
        }
    }
}