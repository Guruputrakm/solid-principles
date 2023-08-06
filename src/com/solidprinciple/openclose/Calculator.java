package com.solidprinciple.openclose;

public class Calculator {

    public void calculate(int v1, int v2, Operation operation) {
        int performed = operation.perform(v1, v2);
        System.out.println(performed);
    }
}
