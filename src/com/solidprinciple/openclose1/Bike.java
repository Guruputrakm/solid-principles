package com.solidprinciple.openclose1;

public class Bike implements Motor{
    @Override
    public void runs() {
        System.out.println("Two wheler is running");
    }
}
