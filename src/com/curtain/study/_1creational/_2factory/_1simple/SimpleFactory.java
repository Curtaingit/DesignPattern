package com.curtain.study._1creational._2factory._1simple;

/**
 * 使用简单工厂来创建对象
 * 这样如果增加新的子类，但是客户类并不需要变化
 * 只要调用createProduct方法即可
 * @author Curtain
 * @date 2018/7/3 10:34
 */
public class SimpleFactory {

    public Product createProduct(int type){
        if (type == 1) {
            return new ConcreteProduct1();
        } else if (type == 2) {
            return new ConcreteProduct2();
        } else {
            return new ConcreteProduct3();
        }
    }
}


