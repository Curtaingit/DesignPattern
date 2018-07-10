package com.curtain.study.other._2customannotation;

/**
 * 测试使用
 * @author Curtain
 * @date 2018/7/10 17:20
 */
public class Client {

    public static void main(String[] args) {
        Apple apple = new Apple();
        System.out.println(apple);
        FruitInfoUtil.getFruitInfo(apple);
        System.out.println(apple);
    }
}
