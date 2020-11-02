package ru.mirea.canh.pr11.task4;

public class Const implements TripleExpression {
    final int constant;

    public Const(int constant) {
        this.constant = constant;
    }

    @Override
    public int evaluate(int x, int y, int z) {
        return constant;
    }
}
