package com.example.zhang.test.Strategy;

/**
 * Created by zhang on 1/7/2017.
 */
public class TaxiStrategy implements CalculateStrategy {
    @Override
    public int calculatePrice(int distance) {
        return distance * 2;
    }
}
