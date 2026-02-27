package com.dupu;

public class OperationFactory {
    public static Operation getOperation(String op) {
        switch (op) {
            case "+":
                return new AddOperation();
            case "-":
                return new SubtractOperation();
           case "*":
               return new MultiplyOperation();
           case "/":
               return new DivideOperation();
           default:
               throw new IllegalArgumentException();
        }
    }
}
