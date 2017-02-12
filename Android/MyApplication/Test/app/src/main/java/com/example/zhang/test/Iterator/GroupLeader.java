package com.example.zhang.test.Iterator;

import android.util.Log;

/**
 * Created by zhang on 1/10/2017.
 */
public class GroupLeader extends Leader {
    @Override
    int limit() {
        return 1000;
    }

    @Override
    void handler(int money) {
        System.out.println("组长批复:" + String.valueOf(money));
    }
}
