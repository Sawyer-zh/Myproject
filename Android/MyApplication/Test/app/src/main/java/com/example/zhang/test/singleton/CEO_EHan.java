package com.example.zhang.test.singleton;

import android.text.StaticLayout;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Created by zhang on 1/4/2017.
 */

//饿汉式单例模式
public class CEO_EHan extends Staff {

    private static final CEO_EHan mCEO = new CEO_EHan();

    private CEO_EHan() {
    }

    public static CEO_EHan getInstance() {
        return mCEO;
    }

    @Override
    public void work() {
        super.work();
    }
}

//懒汉式
class CEO_LanHan extends Staff {

    private static CEO_LanHan mCEO;

    private CEO_LanHan() {

    }

    public static synchronized CEO_LanHan getmCEO() {
        if (mCEO == null) mCEO = new CEO_LanHan();
        return mCEO;
    }
}

//DoubleCheck

class CEO_DoubleCheck extends Staff {
    private static CEO_DoubleCheck mCEO;

    private CEO_DoubleCheck() {

    }

    public static CEO_DoubleCheck getmCEO() {

        if (mCEO == null) {
            synchronized (CEO_DoubleCheck.class) {
                if (mCEO == null) {
                    mCEO = new CEO_DoubleCheck();
                }
            }
        }
        return mCEO;
    }
}

//静态内部类
class CEO_InnerClass extends Staff{

    private CEO_InnerClass(){}

    public CEO_InnerClass getmCEO(){
        return CEOInner.mCEO;
    }

    private static class CEOInner{
        private static final CEO_InnerClass mCEO = new CEO_InnerClass();
    }

}

//枚举
enum CEO_Enum{
    CEO_ENUM;
}

//另类的实现,把所有单例封装起来
class SingletonManger{
    private static Map<String,Objects> objectsMap = new HashMap<>();

    private SingletonManger(){}

    public static void registerService(String key ,Objects instance){
        if (!objectsMap.containsKey(key)){
            objectsMap.put(key,instance);
        }
    }

    public static Objects getService(String key){
        return objectsMap.get(key);
    }
}