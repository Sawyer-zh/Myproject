package com.example.zhang.test.Command;



/**
 * Created by zhang on 1/11/2017.
 * 接收这,执行具体的逻辑
 *
 */
public class TetrisMachine {
    /**
     * 行为方法
     */

    public void toLeft(){
        System.out.println("toleft");
    }

    public void toRight(){
        System.out.println("toright");
    }

    public void fastToBottom(){
        System.out.println("fastToBottom");
    }

    public void transform(){
        System.out.println("transform");
    }
}
