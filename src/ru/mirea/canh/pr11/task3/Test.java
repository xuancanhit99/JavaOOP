package ru.mirea.canh.pr11.task3;

import java.util.Scanner;

public class Test {
    public static void evaluate() {
        try {
            Scanner scanner = new Scanner(System.in);
            double x = scanner.nextDouble();
            Operation function = new Add(
                    new Subtract(
                            new Multiply(
                                    new Variable("x"),
                                    new Variable("x")
                            ),
                            new Multiply(
                                    new Const(2),
                                    new Variable("x")
                            )
                    ),
                    new Const(1)
            );
            System.out.println(function.evaluate(x));
        } catch (Exception exception) {
            System.out.print("\nInvalid input!\nEnter number: ");
            evaluate();
        }
    }

    public static void main(String[] args) {
        System.out.print("This program calculates the input:" +
                "\nFunction value [x^2 - 2*x + 1], - x is the input value.\n\n" +
                "Enter the value x: ");
        evaluate();
    }
}
