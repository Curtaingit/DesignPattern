package com.curtain.study._3struct._2bridge;

/**
 * @author Curtain
 * @date 2018/7/18 16:01
 */
public class Sony extends TV {

    @Override
    public void on() {
        System.out.println("Sony.on()");
    }

    @Override
    public void off() {
        System.out.println("Sony.off()");
    }

    @Override
    public void tuneChannel() {
        System.out.println("Sony.tuneChannel()");
    }
}
