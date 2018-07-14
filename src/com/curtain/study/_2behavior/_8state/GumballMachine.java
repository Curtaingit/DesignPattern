package com.curtain.study._2behavior._8state;

/**
 * @author Curtain
 * @date 2018/7/13 8:43
 */
public class GumballMachine {
    private State soldOustState;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;

    private State state;
    private int count = 0;

    public GumballMachine(int numberGumballs){
        count = numberGumballs;
        soldOustState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);

        if (numberGumballs>0){
            state = noQuarterState;
        }else {
            state = soldOustState;
        }
    }

    public void insertQuarter(){
        state.insertQuarter();
    }

    public void ejectQuarter(){
        state.ejectQuarter();
    }

    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }

    public void setState(State state){
        this.state = state;
    }

    public void releaseBall(){
        System.out.println("A gumball comes rolling out the slot...");
        if (count!=0){
            count -= 1;
        }
    }

    public State getSoldState() {
        return soldState;
    }

    public State getNoQuarterState(){
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldOustState() {
        return soldOustState;
    }

    public int getCount() {
        return count;
    }
}
