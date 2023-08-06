package com.solidprinciple.openclose;

public class MainClass {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        calculator.calculate(10,20, new Addition());

        calculator.calculate(20,10, new Substraction());

        calculator.calculate(20, 10, (a, b) -> a/b); // Simple by using java lambda example

    }
}
