package com.bit;

public class MyCalculate {
    public IShape getRectangle() {
        return rectangle;
    }

    public void setRectangle(IShape rectangle) {
        this.rectangle = rectangle;
    }

    public IShape getCycle() {
        return cycle;
    }

    public void setCycle(IShape cycle) {
        this.cycle = cycle;
    }

    private IShape rectangle;

    private IShape cycle;

    public MyCalculate(){}

    public IShape caclulate(String shapeName){
        if(shapeName.equals("rectangle")){
            return this.getRectangle();
        }
        if(shapeName.equals(cycle)){
            return  this.getCycle();
        }
        return null;
    }

}
