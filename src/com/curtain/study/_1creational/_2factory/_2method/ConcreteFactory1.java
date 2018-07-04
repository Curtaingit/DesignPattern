package com.curtain.study._1creational._2factory._2method;

/**
 * @author Curtain
 * @date 2018/7/3 10:56
 */
public class ConcreteFactory1 extends Factory {
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct1();
    }
}
