package com.curtain.study._2behavior._7observer;

/**
 * @author Curtain
 * @date 2018/7/12 14:58
 */
public class StatisticsDisplay implements Observer {
    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println("StatisticsDisplay:"+temp+" "+humidity+" "+pressure);
    }

    public StatisticsDisplay(Subject weatherData){
        weatherData.resisterObserver(this);
    }
}
