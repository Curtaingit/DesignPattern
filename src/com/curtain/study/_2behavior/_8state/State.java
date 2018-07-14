package com.curtain.study._2behavior._8state;

/**
 * @author Curtain
 * @date 2018/7/13 8:40
 */
public interface State {

    /*投入*/
    void insertQuarter();

    /*退还*/
    void ejectQuarter();

    /*转动*/
    void turnCrank();

    /*发放*/
    void dispense();
}
