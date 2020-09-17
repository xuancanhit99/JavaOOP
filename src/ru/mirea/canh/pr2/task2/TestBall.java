package ru.mirea.canh.pr2.task2;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(100, 100);
        Ball b2 = new Ball(70, 30);
        System.out.println(b1);
        b1.setXY(150,170);
        b1.move(45, 20);
        System.out.println(b1);

        b2.setX(80);
        b2.setY(95);
        System.out.println(b2);
        b2.move(35, 10);
        System.out.println(b2);
    }
}


