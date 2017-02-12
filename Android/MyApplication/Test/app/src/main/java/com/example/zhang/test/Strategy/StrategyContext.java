package com.example.zhang.test.Strategy;

/**
 * Created by zhang on 1/7/2017.
 */
public class StrategyContext implements CalculateStrategy{
    private CalculateStrategy mCalculateStrategy;

    public void setmCalculateStrategy(CalculateStrategy mCalculateStrategy) {
        this.mCalculateStrategy = mCalculateStrategy;
    }

    @Override
    public int calculatePrice(int distance) {
        return mCalculateStrategy.calculatePrice(distance);
    }
}
