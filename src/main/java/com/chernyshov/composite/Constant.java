package com.chernyshov.composite;

/**
 * Constant
 * @author dchernyshov
 */
public class Constant implements Expression {
    private double value;
    
    public Constant(double value) {
        this.value = value;
    }
    
    public double getValue() {
        return value;
    }
}
