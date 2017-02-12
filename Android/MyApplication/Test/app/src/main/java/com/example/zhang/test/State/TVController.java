package com.example.zhang.test.State;

/**
 * Created by zhang on 1/7/2017.
 */
public class TVController implements PowerController{

    TVState mTVState;

    public void setmTVState(TVState mTVState) {
        this.mTVState = mTVState;
    }

    public void powerOn() {
        setmTVState(new PowerOnState());
        System.out.println("开机状态");
    }

    public void powerOff() {
        setmTVState(new PowerOffState());
        System.out.println("关机中泰");
    }

    public void nextChannel() {
        mTVState.nextChannel();
    }

    public void prevChannel() {
        mTVState.prevChannel();
    }

    public void turnUp() {
        mTVState.turnUp();
    }

    public void turnDown() {
        mTVState.turnDown();
    }
}
