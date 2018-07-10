package com.curtain.study._2behavior._5Mediator;

/**
 * @author Curtain
 * @date 2018/7/10 9:10
 */
public class ConcreteMediator extends Mediator {
    private Alarm alarm;
    private CoffeePot coffeePot;
    private Calender calender;
    private Sprinkler sprinkler;

    @Override
    public void doEvent(String eventType) {
        switch (eventType) {
            case "alarm":
                doAlarmEvent();
                break;
            case "coffeePot":
                doCoffeePotEvent();
                break;
            case "calender":
                doCalender();
                break;
            case "sprinkler":
                doSprinkler();
                break;
        }
    }

    public ConcreteMediator(Alarm alarm, CoffeePot coffeePot, Calender calender, Sprinkler sprinkler) {
        this.alarm = alarm;
        this.coffeePot = coffeePot;
        this.calender = calender;
        this.sprinkler = sprinkler;
    }

    private void doAlarmEvent() {
        alarm.doAlarm();
    }

    private void doCoffeePotEvent() {
        coffeePot.doCoffeePot();
    }

    private void doCalender() {
        calender.doCalender();
    }

    private void doSprinkler() {
        sprinkler.doSprinkler();
    }

}
