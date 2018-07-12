package com.curtain.study._2behavior._6memento;

/**
 * Originator Interface
 * @author Curtain
 * @date 2018/7/12 8:47
 */
public interface Calculator {

    PreviousCalculationToCareTaker backupLastCalculation();

    void restorePreviousCalculation(PreviousCalculationToCareTaker memento);

    int getCalculationResult();

    void setFirstNumber(int firstNumber);

    void setSecondNumber(int secondNumber);
}
