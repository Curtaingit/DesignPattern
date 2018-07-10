package com.curtain.study._2behavior._5Mediator;

/**
 * @author Curtain
 * @date 2018/7/10 9:02
 */
public class CoffeePot extends Colleague {
    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent("coffeePot");
    }

    public void doCoffeePot(){
        System.out.println("doCoffeePot");
    }
}
