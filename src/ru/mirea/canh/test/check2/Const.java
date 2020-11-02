package ru.mirea.canh.test.check2;

public class Const implements TripleExpression {
    private int tmp;

    public Const(int x) {
        tmp = x;
    }

    public int evaluate(int x, int y, int z) {
        return tmp;
    }
}
