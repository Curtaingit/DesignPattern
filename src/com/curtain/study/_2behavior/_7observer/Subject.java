package com.curtain.study._2behavior._7observer;

/**
 * @author Curtain
 * @date 2018/7/12 14:55
 */
public interface Subject {

    void resisterObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();
}
