package com.example.zhang.test.Factory;

/**
 * Created by zhang on 1/7/2017.
 */
public abstract class Factory {

    public abstract <T extends Product> T createProduct(Class clazz);
}
