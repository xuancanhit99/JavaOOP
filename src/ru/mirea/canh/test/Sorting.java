package ru.mirea.canh.test;

import java.util.*;
public class Sorting
{
    public static void main(String[] args)
    {
        Stack<String> animals= new Stack<>();
        Stack<String> test = new Stack<>();

        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");

        test.add("Hello");
        test.add("Anh");
        test.add("Yeu");

        System.out.println("Stack: " + animals);
        System.out.println("Stack: " + test);

    }
}