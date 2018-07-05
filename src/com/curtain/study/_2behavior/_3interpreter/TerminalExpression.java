package com.curtain.study._2behavior._3interpreter;

import java.util.StringTokenizer;

/**
 * @author Curtain
 * @date 2018/7/5 10:44
 */
public class TerminalExpression extends Expression {

    private String literal = null;

    public TerminalExpression(String str) {
        literal = str;
    }

    @Override
    public boolean interpret(String str) {
        StringTokenizer st = new StringTokenizer(str);
        while (st.hasMoreTokens()) {
            String test = st.nextToken();
            if (test.equals(literal)) {
                return true;
            }
        }
        return false;
    }
}
