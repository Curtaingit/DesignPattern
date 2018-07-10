package com.curtain.study._2behavior._5Mediator;

/**
 * @author Curtain
 * @date  2018/7/10 9:08
 */
public class Sprinkler extends Colleague {

    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent("sprinkler");
    }

    public void doSprinkler(){
        System.out.println("doSprinkler");
    }
}
