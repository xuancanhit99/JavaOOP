package ru.mirea.canh.pr3.task2;

public class Rectangle extends Shape {
    protected double width;
    protected double length;
    public Rectangle(){}

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filler) {
        super(color, filler);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimeter() {
        return 2*(width+length);
    }

    @Override
    public String toString() {
        return "Shape: Rectangle, width: " + width + ", length: " + length + ", color: " + color  + ", filler: " + filler;
    }
}
