package com.curtain.study._1creational._4prototype;

/**
 * 使用原型设计模式  创建一个
 * @author Curtain
 * @date 2018/7/4 9:22
 */
public class Client {

    public static void main(String[] args) {
        Prototype prototype = new ConcretePrototype("abcd");
        Prototype clone = prototype.myClone();
        System.out.println(clone.toString());
    }
}
