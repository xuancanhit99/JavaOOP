package ru.mirea.canh.pr12;

import ru.mirea.canh.pr12.task1.Person;
import ru.mirea.canh.pr12.task2.Address;
import ru.mirea.canh.pr12.task3.Shirt;
import ru.mirea.canh.pr12.task4.PhoneParser;
import ru.mirea.canh.pr12.task5.WordConcatenator;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //1
        Person person1 = new Person("Ivan");
        Person person2 = new Person(null, "", "Petrov");
        Person person3 = new Person("Sergey", "Svetkov", "Sergevic");
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

        System.out.println("\n\n\n");
        //2
        Address a1 = new Address("Россия,  Москва   ,    Москва, проспект Вернадского, 78, 7, Г-226-1", false);
        Address a2 = new Address(" Россия,  Москва  .   Москва, Новокузнецкая, 13; 1, 185", true);
        Address a3 = new Address("Беларусь, Минск, Минск, Улица Маяковского, 15, 1, 4", false);
        Address a4 = new Address("Россия; Санкт-Петербург;      Санкт-Петербург    . Старо-Петергофский прсспект, 12, 1. 1", true);
        System.out.println(a1 + "\n");
        System.out.println(a2 + "\n");
        System.out.println(a3 + "\n");
        System.out.println(a4);

        System.out.println("\n\n\n");
        //3
        String[] s = new String[]{
                "S001,Black Polo Shirt,Black,XL",
                "S002,Black Polo Shirt,Black,L",
                "S003,Blue Polo Shirt,Blue,XL",
                "S004,Blue Polo Shirt,Blue,M",
                "S005,Tan Polo Shirt,Tan,XL",
                "S006,Black T-Shirt,Black,XL",
                "S007,White T-Shirt,White,XL",
                "S008,White T-Shirt,White,L",
                "S009,Green T-Shirt,Green,S",
                "S010,Orange T-Shirt,Orange,S",
                "S011,Maroon Polo Shirt,Maroon,S"
        };

        Shirt[] shirts = new Shirt[s.length];
        for (int i = 0; i < s.length; i++) {
            shirts[i] = new Shirt(s[i]);
            System.out.println(shirts[i] + "\n");
        }

        System.out.println("\n\n\n");
        //4
        System.out.println(new PhoneParser("88005553535"));
        System.out.println(new PhoneParser("+79623609925"));
        System.out.println(new PhoneParser("+118005553535"));
        System.out.println(new PhoneParser("+1238005553535"));

        System.out.println("\n\n\n");
        //5
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        try (FileReader fr = new FileReader(path)) {
            int c;
            while ((c = fr.read()) != -1) {
                sb.append((char) c);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(WordConcatenator.getLine(sb.toString()));
    }
}
