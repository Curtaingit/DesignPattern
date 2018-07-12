package com.curtain.study._2behavior._6memento;

/**
 * 备忘录（Memento）
 * 在不违反封装的情况下获得对象的内部状态，从而在需要时可以将对象恢复到最初状态。
 * 以下实现了一个简单计算器程序，可以输入两个值，然后计算这两个值的和。
 * 备忘录模式允许将这两个值存储起来，然后在某个时刻用存储的状态进行恢复。
 * @author Curtain
 * @date 2018/7/12 9:04
 */
public class Client {

    public static void main(String[] args) {
        Calculator calculator = new CalculatorImpl();

        calculator.setFirstNumber(10);
        calculator.setSecondNumber(100);

        System.out.println(calculator.getCalculationResult());

        PreviousCalculationToCareTaker memento = calculator.backupLastCalculation();

        calculator.setFirstNumber(1);
        calculator.setSecondNumber(14);

        System.out.println(calculator.getCalculationResult());

        calculator.restorePreviousCalculation(memento);

        System.out.println(calculator.getCalculationResult());
    }
}
