package com.curtain.study._2behavior._10templatemethod;

/**
 * @author Curtain
 * @date 2018/7/14 15:59
 */
public abstract class CaffeineBeverage {

    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void  brew();

    abstract void addCondiments();

    void boilWater(){
        System.out.println("boilWater");
    }

    void pourInCup(){
        System.out.println("pourInCup");
    }
}
