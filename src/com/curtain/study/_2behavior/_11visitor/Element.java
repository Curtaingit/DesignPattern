package com.curtain.study._2behavior._11visitor;



/**
 * @author Curtain
 * @date 2018/7/16 8:54
 */
public interface Element {
    void accept(Visitor visitor);
}
