package ru.mirea.canh.pr11.task4;

import java.util.Scanner;

public class Test {
    public static void evaluate() {
        try {
            Scanner scanner = new Scanner(System.in);
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            double z = scanner.nextDouble();
            ExpressionParser function = new Divide(
                    new Multiply(
                            new Const(1000000),
                            new Multiply(
                                    new Variable("x"),
                                    new Multiply(
                                            new Variable("x"),
                                            new Multiply(
                                                    new Variable("x"),
                                                    new Multiply(
                                                            new Variable("x"),
                                                            new Variable("x")
                                                    )
                                            )
                                    )
                            )
                    ),
                    new Subtract(
                            new Variable("x"),
                            new Const(1)
                    )
            );
            System.out.println(function.evaluate(x, y, z));

        } catch (Exception exception) {
            System.out.print("\nInvalid input!\nEnter number: ");
            evaluate();
        }
    }

    public static void main(String[] args) {
        System.out.print("This program calculates the input:" +
                "\nFunction value [x * (y-2) * z + 1], - x is the input value.\n\n" +
                "Enter the value x, y, z: ");
        evaluate();
    }
}
