package com.example.zhang.test.Iterator;

/**
 * Created by zhang on 1/10/2017.
 */
public abstract class Leader {

    //责任链模式:Handler 抽象类,定义 1:自己的权限   2:自己如果没有权限,交给下个人处理;

    protected Leader nextHandler;

    public final void handlerRequest(int money){

        if(money<limit()){
            handler(money);
        }else {
            if(null != nextHandler){
                nextHandler.handlerRequest(money);
            }
        }

    }

    abstract int limit();

    abstract void handler(int money);

}
