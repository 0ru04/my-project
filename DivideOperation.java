package com.dupu;

public class DivideOperation implements Operation {
    @Override
    public double calculate(double a, double b) {
        if( b == 0) {
           throw new IllegalArgumentException("除数不能为0");
        }
        return a / b;
    }

}
