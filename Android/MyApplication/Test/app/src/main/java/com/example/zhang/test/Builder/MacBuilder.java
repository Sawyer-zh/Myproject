package com.example.zhang.test.Builder;

/**
 * Created by zhang on 1/5/2017.
 */
public class MacBuilder extends Builder {

    private Computer mComputer = new Mac();

    @Override
    public Builder buildBoard(String board) {
        mComputer.setmBoard(board);
        return this;
    }

    @Override
    public Builder buildDisplay(String display) {
        mComputer.setmDisplay(display);
        return this;
    }

    @Override
    public Builder buildOS() {
        mComputer.setmOS();
        return this;
    }

    @Override
    public Computer creater() {
        return mComputer;
    }
}
