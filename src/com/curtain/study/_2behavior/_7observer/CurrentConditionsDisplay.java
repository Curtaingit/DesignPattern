package com.curtain.study._2behavior._7observer;

/**
 * @author Curtain
 * @date 2018/7/12 14:58
 */
public class CurrentConditionsDisplay implements Observer {
    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println("CurrentConditionsDisplay:"+temp+" "+humidity+" "+pressure);
   }

   public CurrentConditionsDisplay(Subject weatherData){
        weatherData.resisterObserver(this);
   }
}
