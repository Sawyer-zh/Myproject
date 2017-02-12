package com.example.zhang.test.Strategy;

/**
 * Created by zhang on 1/7/2017.
 */
public class SubwayStrategy implements CalculateStrategy {
    @Override
    public int calculatePrice(int distance) {
        return 2;
    }
}
