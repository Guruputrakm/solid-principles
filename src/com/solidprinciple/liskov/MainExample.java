package com.solidprinciple.liskov;

import java.util.Arrays;
import java.util.List;

public class MainExample {
    public static void main(String[] args) {
        MainExample mainExample = new MainExample();
        List<Draw> circles = Arrays.asList(Circle.builder()
                .radious(10).build(),Circle.builder()
                .radious(20).build());
        List<Rectangle> rectangles = Arrays.asList(Rectangle.builder()
                .width(1).hight(6).build(),Rectangle.builder()
                .width(5).hight(10).build());
        mainExample.drawShapes(circles);
    }

    public void drawShapes(List<Draw> shapes) {
        shapes.stream().forEach(s -> s.draw());
    }

    public void getShape(List<Shape> shapes) {
        shapes.stream().forEach(shape -> shape.getArea());
    }
}
