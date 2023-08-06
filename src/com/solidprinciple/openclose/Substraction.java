package com.solidprinciple.openclose;

public class Substraction implements Operation{
    @Override
    public int perform(int value1, int value2) {
        return value1-value2;
    }
}
