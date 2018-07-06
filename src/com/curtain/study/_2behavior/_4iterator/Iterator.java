package com.curtain.study._2behavior._4iterator;

/**
 * @author Curtain
 * @date 2018/7/6 15:07
 */
public interface Iterator<Item> {
    Item next();

    boolean hasNext();
}
