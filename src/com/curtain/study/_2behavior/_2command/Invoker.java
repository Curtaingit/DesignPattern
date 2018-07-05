package com.curtain.study._2behavior._2command;

/**
 * 遥控器
 * @author Curtain
 * @date 2018/7/5 9:48
 */
public class Invoker {
    private Command[] onCommands;
    private Command[] offCommands;
    private final int sloNum = 7;

    public Invoker(){
        this.onCommands = new Command[sloNum];
        this.offCommands = new Command[sloNum];
    }

    public void setOnCommand(Command command,int slot) {
        onCommands[slot] = command;
    }


    public void setOffCommand(Command command,int slot){
        offCommands[slot] = command;
    }

    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
    }

    public void offButtonWasPushd(int slot){
        offCommands[slot].execute();
    }


}
