package com.curtain.study._2behavior._3interpreter;

/**
 * @author Curtain
 * @date 2018/7/5 10:49
 */
public class OrExpression extends Expression {

    private Expression expression1 = null;
    private Expression expression2 = null;

    public OrExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpret(String str) {
        return expression1.interpret(str) || expression2.interpret(str);
    }
}
