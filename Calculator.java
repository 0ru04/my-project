package com.dupu;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in);)
        {
        System.out.println("请输入第一个数字：");
        double num1=sc.nextDouble();

        System.out.println("请输入运算符（+，-，*，/）");
        String op=sc.next();

        System.out.println("请输入第二个数字：");
        double num2=sc.nextDouble();

        Operation operation=OperationFactory.getOperation(op);
        double result=operation.calculate(num1, num2);
        System.out.println(result);
        }catch(Exception e){
            System.out.println("错误："+e.getMessage());
        }



























    }
}
