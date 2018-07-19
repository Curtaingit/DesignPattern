package com.curtain.study._3struct._2bridge;

import com.sun.org.apache.regexp.internal.RE;

/**
 * @author Curtain
 * @date 2018/7/18 16:03
 */
public abstract class RemoteControl {
    protected TV tv;

    public RemoteControl(TV tv){
        this.tv = tv;
    }

    public abstract void on();

    public abstract void off();

    public abstract void tuneChannel();
}
