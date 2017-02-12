package com.example.zhang.test.Builder;

/**
 * Created by zhang on 1/5/2017.
 */
public abstract class Computer {

    protected String mBoard,mDisplay,mOS;

    protected Computer() {
    }

    public void setmBoard(String mBoard) {
        this.mBoard = mBoard;
    }

    public void setmDisplay(String mDisplay) {
        this.mDisplay = mDisplay;
    }

    public abstract void setmOS();

    @Override
    public String toString() {
        return "Computer [mBoard" + mBoard + "mDisplay" + mDisplay + "mOS" + mOS +"]";
    }
}
