package com.curtain.study._3struct._3composite;

/**
 * @author Curtain
 * @date 2018/7/19 8:36
 */
public abstract class Component {
    protected  String name;

    public Component(String name){
        this.name = name;
    }

    public void print(){
        print(0);
    }

    abstract void print(int level);

    public abstract void add(Component component);

    public abstract void remove(Component component);
}
