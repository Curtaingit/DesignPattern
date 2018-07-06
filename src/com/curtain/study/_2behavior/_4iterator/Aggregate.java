package com.curtain.study._2behavior._4iterator;

/**
 * @author Curtain
 * @date 2018/7/6 15:00
 */
public interface Aggregate {
    Iterator createIterator();

    Iterator createIterator(Integer[] items);
}
