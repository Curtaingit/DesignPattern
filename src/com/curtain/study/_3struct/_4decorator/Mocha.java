package com.curtain.study._3struct._4decorator;

/**
 * @author Curtain
 * @date 2018/7/23 15:53
 */
public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 1+beverage.cost();
    }
}
