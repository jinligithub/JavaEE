package com.bit;

/**
 * 计算矩形的面积
 * width:宽
 * hight:高
 */
public class Rectangle implements IShape {
    private double width;
    private double hight;

    public Rectangle() {}

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }


    @Override
    public double area() {
        return width*hight;
    }

    @Override
    public double cycle() {
        return 2*(width+hight);
    }
}
