package com.curtain.study._2behavior._9strategy;

/**
 * @author Curtain
 * @date 2018/7/14 14:59
 */
public class Duck {
    private QuackBehavior quackBehavior;

    public void performQuack(){
        if (quackBehavior!=null){
            quackBehavior.quack();
        }
    }

    public void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }
}
