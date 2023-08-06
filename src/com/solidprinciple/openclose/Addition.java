package com.solidprinciple.openclose;

public class Addition implements Operation{

    @Override
    public int perform(int value1, int value2) {
        return value1+value2;
    }
}
