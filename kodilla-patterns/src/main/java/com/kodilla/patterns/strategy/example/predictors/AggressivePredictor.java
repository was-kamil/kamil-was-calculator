package com.kodilla.patterns.strategy.example.predictors;

import com.kodilla.patterns.strategy.example.BuyPredictor;

public class AggressivePredictor implements BuyPredictor {
    @Override
    public String predictWhatToBuy() {
        return "[Aggressive predictor] Buy stock of XYZ";
    }
}