package ru.mirea.canh.pr11.task4;

public class Const implements TripleExpression {
    final double constant;

    public Const(double constant) {
        this.constant = constant;
    }

    @Override
    public double evaluate(double x, double y, double z) {
        return constant;
    }
}
