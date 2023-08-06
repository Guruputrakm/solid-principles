package com.solidprinciple.openclose1;

public class Car implements Motor{
    @Override
    public void runs() {
        System.out.println("Car is running");
    }
}
