package com.solidprinciple.liskov;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Rectangle implements Shape, Draw {

    private double width;

    private double hight;

    @Override
    public void draw() {
        System.out.println("The Rectangle is drawing with hight "+hight+ "and width "+width);
    }

    @Override
    public double getArea() {
        return width*hight;
    }
}
