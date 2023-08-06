package com.solidprinciple.liskov;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Circle implements Shape, Draw{

    private double radious;

    @Override
    public void draw() {
        System.out.println("The Circle is Drawn with radious "+radious);
    }

    @Override
    public double getArea() {
        return Math.PI * radious *radious;
    }
}
