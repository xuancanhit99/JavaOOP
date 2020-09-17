package ru.mirea.canh.pr3.task2;

public class Square extends Rectangle {
    public Square(){}
    public Square(double side) {
        super(side,side);
    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        width = side;
        length = side;
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Shape: Square, side: " + width + ", color: " + color + ", filler: " + filler;
    }
}
