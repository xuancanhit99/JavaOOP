package src.ru.mirea.canh.pr3.task2;

public abstract class Shape {
    protected String color;
    protected boolean filler;

    Shape(){}

    public Shape(String color, boolean filler) {
        this.color = color;
        this.filler = filler;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFiller() {
        return filler;
    }

    public void setFiller(boolean filler) {
        this.filler = filler;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();

}
