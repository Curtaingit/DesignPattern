package com.curtain.study._2behavior._2command;

/**
 * @author Curtain
 * @date 2018/7/5 9:49
 */
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }


    @Override
    public void execute() {
        light.off();
    }
}
