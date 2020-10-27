package ru.mirea.canh.pr11.task3;

public class Multiply extends Operation {
    public Multiply(Input first, Input second) {
        super(first, second);
    }

    @Override
    protected double evaluate(double lhs, double rhs) {
        return lhs * rhs;
    }
}
