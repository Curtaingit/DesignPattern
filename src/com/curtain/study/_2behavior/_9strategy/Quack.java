package com.curtain.study._2behavior._9strategy;

/**
 * @author Curtain
 * @date 2018/7/14 14:57
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("quack!");
    }
}
