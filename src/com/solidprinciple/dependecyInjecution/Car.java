package com.solidprinciple.dependecyInjecution;

public class Car implements Vehicle{
    @Override
    public void runs() {
        System.out.println("The vehicle type is car, and it is running");
    }
}
