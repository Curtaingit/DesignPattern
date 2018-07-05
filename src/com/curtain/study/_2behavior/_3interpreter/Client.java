package com.curtain.study._2behavior._3interpreter;

/**
 * 解释器模式
 * 实现了一个表达式接口，该接口解释一个特定的上下文。
 * 这种模式被用在 SQL 解析、符号处理引擎等。
 *
 * @author Curtain
 * @date 2018/7/5 10:51
 */
public class Client {

    public static Expression buildInterpreterTree() {
        Expression terminal1 = new TerminalExpression("A");
        Expression terminal2 = new TerminalExpression("B");
        Expression terminal3 = new TerminalExpression("C");
        Expression terminal4 = new TerminalExpression("D");

        //B C
        Expression alternation1 = new AndExpression(terminal2, terminal3);

        //A OR (B C)
        Expression alternation2 = new OrExpression(terminal1, alternation1);

        //D AND （A OR（B C））
        return new AndExpression(terminal4, alternation2);
    }

    public static void main(String[] args) {
        Expression define = buildInterpreterTree();
        String context1 = "D A";
        String context2 = "A B";
        System.out.println(define.interpret(context1));
        System.out.println(define.interpret(context2));

        Integer i =3;

    }
}
