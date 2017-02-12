package com.example.zhang.test.Iterator;

/**
 * Created by zhang on 1/10/2017.
 */
public class Manager extends Leader {
    @Override
    int limit() {
        return 10000;
    }

    @Override
    void handler(int money) {
        System.out.println("manager 批复:" + money);
    }
}
