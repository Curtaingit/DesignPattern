package com.curtain.study._3struct._5facade;

/**
 * @author Curtain
 * @date 2018/7/23 16:28
 */
public class SubSystem {
    public void turnOnTV() {
        System.out.println("turnOnTV()");
    }

    public void setCD(String cd) {
        System.out.println("setCD(" + cd + ")");
    }

    public void startWatching(){
        System.out.println("startWatching()");
    }
}
