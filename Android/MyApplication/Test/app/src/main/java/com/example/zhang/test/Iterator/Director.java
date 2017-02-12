package com.example.zhang.test.Iterator;

/**
 * Created by zhang on 1/10/2017.
 */
public class Director extends Leader {
    @Override
    int limit() {
        return 5000;
    }

    @Override
    void handler(int money) {
        System.out.println("director 批复:" + money );
    }
}
