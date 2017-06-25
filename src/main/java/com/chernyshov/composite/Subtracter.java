package com.chernyshov.composite;

/**
 * Subtracter
 * @author dchernyshov
 */
public class Subtracter extends BinaryExpression {
    public Subtracter(Expression left, Expression right) {
        super(left, right);
    }
    
    public double getValue() {
        return left.getValue() - right.getValue();
    }
}
