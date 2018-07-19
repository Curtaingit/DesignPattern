package com.curtain.study._3struct._2bridge;

/**
 * @author Curtain
 * @date 2018/7/18 16:02
 */
public class RCA extends TV {
    @Override
    public void on() {
        System.out.println("RCA.on()");
    }

    @Override
    public void off() {
        System.out.println("RCA.off()");
    }

    @Override
    public void tuneChannel() {
        System.out.println("RCA.tuneChannel()");
    }
}