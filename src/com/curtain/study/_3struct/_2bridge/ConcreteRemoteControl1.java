package com.curtain.study._3struct._2bridge;

import java.rmi.Remote;

/**
 * @author Curtain
 * @date 2018/7/18 16:05
 */
public class ConcreteRemoteControl1 extends RemoteControl{
    public ConcreteRemoteControl1(TV tv) {
        super(tv);
    }

    @Override
    public void on() {
        System.out.println("ConcreteRemoteControl1.on()");
        tv.on();
    }

    @Override
    public void off() {
        System.out.println("ConcreteRemoteControl1.off()");
        tv.off();
    }

    @Override
    public void tuneChannel() {
        System.out.println("ConcreteRemoteControl1.tuneChannel()");
        tv.tuneChannel();
    }
}
