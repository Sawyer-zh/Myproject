package com.example.zhang.test.Factory;

/**
 * Created by zhang on 1/7/2017.
 */
public class ConcreteFactory extends Factory {
    @Override
    public <T extends Product> T createProduct(Class clazz) {
        Product product = null;
        try {
            product = (T)Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T)product;
    }
}
