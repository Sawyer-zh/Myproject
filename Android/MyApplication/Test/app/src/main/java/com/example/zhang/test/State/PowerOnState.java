package com.example.zhang.test.State;

import android.widget.Toast;

/**
 * Created by zhang on 1/7/2017.
 */
public class PowerOnState implements TVState {
    @Override
    public void nextChannel() {
        System.out.println("下一个频道");
    }

    @Override
    public void prevChannel() {
        System.out.println("上一个频道");
    }

    @Override
    public void turnUp() {
        System.out.println("音量加大");
    }

    @Override
    public void turnDown() {
        System.out.println("音量减小");
    }
}
