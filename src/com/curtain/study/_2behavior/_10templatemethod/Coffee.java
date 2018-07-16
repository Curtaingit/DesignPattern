package com.curtain.study._2behavior._10templatemethod;

/**
 * @author Curtain
 * @date 2018/7/14 16:02
 */
public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Coffee.brew");
    }

    @Override
    void addCondiments() {
        System.out.println("Coffee.addCondiments");
    }
}
