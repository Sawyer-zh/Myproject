package com.example.zhang.test.Builder;

/**
 * Created by zhang on 1/5/2017.
 */
public abstract class Builder {

    public abstract Builder buildBoard(String board);

    public abstract Builder buildDisplay(String display);

    public abstract Builder buildOS();

    public abstract Computer creater();

}
