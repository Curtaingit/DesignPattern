package com.curtain.study._3struct._1adapter;

/**
 * @author Curtain
 * @date 2018/7/17 16:27
 */
public class WildTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("gobble");
    }
}
