package com.curtain.study._1creational._3builder;

import java.util.Arrays;

/**
 * 生成器
 * 以下是简易的StringBuilder实现
 * 封装一个对象的构造过程，并允许按步骤构造
 * 参照jdk1.8
 *
 * @author Curtain
 * @date 2018/7/4 8:42
 */
public class AbstractStringBuilder {

    protected char[] value;

    protected int count;

    public AbstractStringBuilder(int capacity) {
        count = 0;
        value = new char[capacity];
    }

    public AbstractStringBuilder append(char c) {
        ensureCapacityInternal(count + 1);
        value[count++] = c;
        return this;
    }

    /**
     * 如果当前数组长度<minimumCapacity  扩容
     *
     * @param minimumCapacity 最小容量为count+1 （当前长度+1）
     */
    private void ensureCapacityInternal(int minimumCapacity) {
        if (minimumCapacity - value.length > 0) {
            expandCapacity(minimumCapacity);
        }
    }

    void expandCapacity(int minimumCapacity) {
        int newCapacity = value.length * 2 + 2;
        if (newCapacity - minimumCapacity < 0) {
            newCapacity = minimumCapacity;
        }
        if (newCapacity < 0) {
            if (minimumCapacity < 0) {
                throw new OutOfMemoryError();
            }
            newCapacity = minimumCapacity;
        }
        value = Arrays.copyOf(value, newCapacity);
    }
}
