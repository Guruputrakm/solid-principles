package com.solidprinciple.openclose1;

public class MainClass {
    public static void main(String[] args) {
        Travel travel = new Travel();

        travel.travel(new Bike());

        travel.travel(new Car());

        travel.travel(() -> System.out.println("Moving in Train"));
    }
}
