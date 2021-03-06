package com.curtain.study._2behavior._2command;

/**
 * @author Curtain
 * @date 2018/7/4 14:02
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
