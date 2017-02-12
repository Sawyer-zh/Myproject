package com.example.zhang.test.Strategy;

/**
 * Created by zhang on 1/7/2017.
 */
public class BusStrategy implements CalculateStrategy {

    @Override
    public int calculatePrice(int distance) {
        return 1;

    }
}
