package com.curtain.study._1creational._3builder;

/**
 * @author Curtain
 * @date 2018/7/4 8:51
 */
public class StringBuilder extends AbstractStringBuilder {

    public StringBuilder() {
        super(16);
    }

    @Override
    public String toString() {
        return new String(value,0,count);
    }

}
