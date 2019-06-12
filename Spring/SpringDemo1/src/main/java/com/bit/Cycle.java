package com.bit;

public class Cycle implements IShape{
    private double radius;
    public Cycle(){}

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI*radius*radius;
    }

    @Override
    public double cycle() {
        return 2*Math.PI*radius;
    }
}
