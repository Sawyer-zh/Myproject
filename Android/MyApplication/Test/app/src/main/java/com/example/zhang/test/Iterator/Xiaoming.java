package com.example.zhang.test.Iterator;

/**
 * Created by zhang on 1/10/2017.
 */
public class Xiaoming {
    public static void main(String[] args) {

        Leader groupLeader = new GroupLeader();
        Leader director = new Director();
        Leader manager = new Manager();

        //指向下一个处理对象
        groupLeader.nextHandler = director;
        director.nextHandler = manager;
        manager.nextHandler = null;

        //最开始的人开始处理
        groupLeader.handlerRequest(5000);
    }
}
