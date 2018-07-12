package com.curtain.study._2behavior._6memento;

/**
 * Memento Object Implementation
 * @author Curtain
 * @date 2018/7/12 8:58
 */
public class PreviousCalculationImp implements PreviousCalculationToCareTaker,PreviousCalculationToOriginator {

    private int firstNumber;
    private int secondNumber;

    public PreviousCalculationImp(int firstNumber, int secondNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    @Override
    public int getFirstNumber() {
        return this.firstNumber;
    }

    @Override
    public int getSecondNumber() {
        return this.secondNumber;
    }
}
