package ru.mirea.canh.pr10.task1;

import java.util.Scanner;

public class TestComplex {
    public static Complex getComplexInvalid() { // Bat loi dau vao
        try {
            final ComplexAbstractFactory factory = new ConcreteFactory();
            final Scanner sc =  new Scanner(System.in);
            return factory.createComplex(sc.nextInt(), sc.nextInt());
        }
        catch (Exception e) {
            System.out.println("Error, please try again!");
            return getComplexInvalid();
        }
    }
    public static void main(String[] args) {
        Complex[] complexes = new Complex[2];
        for(int i=0; i<complexes.length; i++) {
            System.out.print("Complex 1: Enter real and image: ");
            complexes[i] = getComplexInvalid();
        }
        System.out.println(complexes[0]);
        System.out.println(complexes[1]);
        System.out.println("Sum of addition complex 1 and 2");
        System.out.println(complexes[0] + " + " + complexes[1] + " = " + complexes[0].addComplex(complexes[1]));
        System.out.println("Difference of subtraction complex 1 and 2");
        System.out.println(complexes[0] + " - " + complexes[1] + " = " + complexes[0].subComplex(complexes[1]));
        System.out.println("Product of multiplication complex 1 and 2");
        System.out.println(complexes[0] + " * " + complexes[1] + " = " + complexes[0].multiComplex(complexes[1]));
        System.out.println("Quotient of division complex 1 and 2");
        System.out.println(complexes[0] + " / " + complexes[1] + " = " + complexes[0].divisionComplex(complexes[1]));
    }
}
