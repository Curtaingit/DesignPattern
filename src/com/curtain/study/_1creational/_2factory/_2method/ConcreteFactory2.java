package com.curtain.study._1creational._2factory._2method;

/**
 * @author Curtain
 * @date 2018/7/3 10:59
 */
public class ConcreteFactory2 extends Factory {
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct2();
    }
}
