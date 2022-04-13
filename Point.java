package com.company;


 //CH 2 ex 5:
public class Point {
    private double x;
    private double y;

    public Point(){}
    public Point(double x,double y){
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void translate(double x1,double y1){
         this.x += x1;
         this.y += y1;


    }
    public void scale(double z){
        this.x *=z;
        this.y *=z;

    }
}
