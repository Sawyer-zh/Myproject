package com.example.zhang.test.Builder;

/**
 * Created by zhang on 1/5/2017.
 */
public class Director {

    Builder mBuilder = null;

    public Director(Builder builder) {
        mBuilder = builder;
    }

    public void construct(String board, String display) {

        mBuilder.buildBoard(board);

        mBuilder.buildDisplay(display);

        mBuilder.buildOS();
    }

}
