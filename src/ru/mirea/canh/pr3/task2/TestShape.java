package ru.mirea.canh.pr3.task2;

public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.3, "red", true);
        Shape s2 = new Rectangle(5, 6, "blue", true);
        Shape s3 = new Square(8, "black", false);

        s1.setColor("while");
        s1.setFiller(false);
        ((Circle)s1).setRadius(7.2);

        System.out.println(s1);
        System.out.println("- Area: " + s1.getArea());
        System.out.println("- Perimeter: " + s1.getPerimeter());

        ((Rectangle)s2).setLength(12);
        System.out.println(s2);
        System.out.println("- Area: " + s2.getArea());
        System.out.println("- Perimeter: " + s2.getPerimeter());

        ((Square)s3).setWidth(6);
        System.out.println(s3);
    }
}
