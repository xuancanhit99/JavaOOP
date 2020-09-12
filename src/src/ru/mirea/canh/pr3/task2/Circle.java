package src.ru.mirea.canh.pr3.task2;

public class Circle extends Shape {
    protected double radius;
    //public Circle() {}
    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public double getPerimeter() {
        return Math.PI*2*radius;
    }

    @Override
    public String toString() {
        return "Shape: Circle, radius: " + radius + ", color: " + color + ", filler: " + filler;
    }
}

