package com.kodilla.patterns.strategy.example;

import com.kodilla.patterns.strategy.example.predictors.AggressivePredictor;

public class IndividualYoungCustomer extends Customer {
    public IndividualYoungCustomer(String name) {
        super(name);
        this.buyPredictor = new AggressivePredictor();
    }
}