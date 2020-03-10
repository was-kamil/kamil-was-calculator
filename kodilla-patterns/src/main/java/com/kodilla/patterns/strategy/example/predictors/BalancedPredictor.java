package com.kodilla.patterns.strategy.example.predictors;

import com.kodilla.patterns.strategy.example.BuyPredictor;

public class BalancedPredictor implements BuyPredictor {
    @Override
    public String predictWhatToBuy() {
        return "[Balanced predictor] Buy shared units of Fund XYZ";
    }
}