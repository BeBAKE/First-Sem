package com.company.OOps;

public class Point {
    private int x;
    private int y;

    public Point(){
    }
    public Point(int x ,int y){
        this.x= x;
        this.y=y;
    }

    //    First distance
    public double distance(Point a){
        double X = (this.x-a.x)*(this.x-a.x);
        double Y= (this.y-a.y)*(this.y-a.y);
        return Math.sqrt(X+Y);
    }

    // Second Distance
    public double distance (int one,int two){
        double X = (this.x-one)*(this.x-one);
        double Y= (this.y-two)*(this.y-two);
        return Math.sqrt(X+Y);
    }

    // third Distance
    public double distance (){
        double X = (this.x)*(this.x);
        double Y= (this.y)*(this.y);
        return Math.sqrt(X+Y);
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
