package src.ru.mirea.canh.pr3.task2;

public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.3, "red", true);
        Shape s2 = new Rectangle(5, 6, "blue", true);
        Shape s3 = new Square(8, "black", false);

        s1.setColor("while");
        s1.setFiller(false);
        System.out.println(s1);
        System.out.println("- Area: " + s1.getArea());
        System.out.println("- Perimeter: " + s1.getPerimeter());

        System.out.println(s2);
        System.out.println("- Area: " + s2.getArea());
        System.out.println("- Perimeter: " + s2.getPerimeter());

        System.out.println(s3);
    }
}
