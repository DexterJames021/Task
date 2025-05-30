package onlineClass;

import static java.lang.Math.PI;

interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

public class Task15 implements Shape {
    private int radius;

    public Task15(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        // TODO Auto-generated method stub
        return PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        // TODO Auto-generated method stub
        return 2 * PI * radius;
    };

    public static void main(String[] args) {

    }
}

abstract class AbstractShape implements Shape {
    private int radius;
    private String color;
    private double length;
    private double width;

    @Override
    public double calculateArea() {
        // TODO Auto-generated method stub
        return PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        // TODO Auto-generated method stub
        return 2 * PI * radius;
    }

}