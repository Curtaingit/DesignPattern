package com.curtain.study._2behavior._10templatemethod;

/**
 * @author Curtain
 * @date 2018/7/14 16:03
 */
public class Tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Tea.brew");
    }

    @Override
    void addCondiments() {
        System.out.println("Tea.addCondiments");
    }
}
