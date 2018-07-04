package com.curtain.study._1creational._2factory._2method;

/**
 * @author Curtain
 * @date 2018/7/4 9:24
 */
public class Client {

    public static void main(String[] args) {
        Factory factory = new ConcreteFactory1();
        factory.doSomething();
    }
}
