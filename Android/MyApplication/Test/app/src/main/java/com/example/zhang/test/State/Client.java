package com.example.zhang.test.State;

/**
 * Created by zhang on 1/7/2017.
 */
public class Client {

    public static void main(String[] args){
        TVController tvController = new TVController();

        tvController.powerOn();

        tvController.nextChannel();

        tvController.powerOff();

    }
}
