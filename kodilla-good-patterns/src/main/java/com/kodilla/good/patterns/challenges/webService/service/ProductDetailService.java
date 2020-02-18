package com.kodilla.good.patterns.challenges.webService.service;
import com.kodilla.good.patterns.challenges.webService.data.Product;


public interface ProductDetailService {

    Product findProduct (long productId);
}