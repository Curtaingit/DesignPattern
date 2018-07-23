package com.curtain.study._3struct._5facade;

/**
 * @author Curtain
 * @date 2018/7/23 16:28
 */
public class Facade {
    private SubSystem subSystem = new SubSystem();

    public void watchMovie(){
        subSystem.turnOnTV();
        subSystem.setCD("movie");
        subSystem.startWatching();
    }
}
