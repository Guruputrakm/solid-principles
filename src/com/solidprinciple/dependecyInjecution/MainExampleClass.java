package com.solidprinciple.dependecyInjecution;

public class MainExampleClass {

    public static void main(String[] args) {
        VehileMovement vehileMovement = new VehileMovement();

        Vehicle car = new Car();
        vehileMovement.movingVehicle(car);
        vehileMovement.movingVehicle(new TwoWheeler());
    }
}
