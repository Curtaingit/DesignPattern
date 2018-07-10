package com.curtain.study._2behavior._5Mediator;

/**
 * @author Curtain
 * @date 2018/7/10 9:00
 */
public class Alarm extends Colleague {
    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent("alarm");
    }

    public void doAlarm(){
        System.out.println("doAlarm");
    }
}
