package com.kodilla.patterns.strategy.example.predictors;

import com.kodilla.patterns.strategy.example.BuyPredictor;

public class ConservativePredictor implements BuyPredictor {
    @Override
    public String predictWhatToBuy() {
        return "[Conservative predictor] Buy debentures of XYZ";
    }
}