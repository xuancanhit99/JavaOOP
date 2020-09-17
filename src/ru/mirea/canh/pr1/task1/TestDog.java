package ru.mirea.canh.pr1.task1;

public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("Jack", 2);
        Dog d2 = new Dog("Rob", 5);
        Dog d3 = new Dog("Kayin");
        d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}