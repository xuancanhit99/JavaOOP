package ru.mirea.canh.pr3.task5;

public class TestMovable {
    public static void main(String[] args) {
        Movable m1 = new MovableRectangle(5, 10,15,20, 5, 5);
        System.out.println(m1);
        m1.moveUp();
        m1.moveRight();
        System.out.println(m1);

        Movable m2 = new MovableRectangle(7, 9,14,27, 6, 8);
        System.out.println(m2);
        m1.moveDown();
        m1.moveLeft();
        System.out.println(m2);
    }
}
