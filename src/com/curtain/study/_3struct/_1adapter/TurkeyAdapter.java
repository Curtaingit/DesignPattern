package com.curtain.study._3struct._1adapter;

/**
 * @author Curtain
 * @date 2018/7/17 16:28
 */
public class TurkeyAdapter implements Duck {

    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }
}
