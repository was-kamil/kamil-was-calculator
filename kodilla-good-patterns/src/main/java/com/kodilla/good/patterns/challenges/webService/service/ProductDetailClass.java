package com.kodilla.good.patterns.challenges.webService.service;

import com.kodilla.good.patterns.challenges.webService.data.Category;
import com.kodilla.good.patterns.challenges.webService.data.Product;

public class ProductDetailClass implements ProductDetailService {

    @Override
    public Product findProduct(long productID) {
        return new Product("Coat", 1002, 50.99, Category.FASION);
    }
}