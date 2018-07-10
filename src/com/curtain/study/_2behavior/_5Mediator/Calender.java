package com.curtain.study._2behavior._5Mediator;

/**
 * @author Curtain
 * @date 2018/7/10 9:06
 */
public class Calender extends Colleague {

    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent("calender");
    }

    public void doCalender(){
        System.out.println("doCalender()");
    }
}
