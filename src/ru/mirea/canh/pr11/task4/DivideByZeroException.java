package ru.mirea.canh.pr11.task4;

public class DivideByZeroException extends Exception {
    public DivideByZeroException() {
        super("division by zero");
    }
}
