package ru.mirea.canh.test.check2;

public class Subtract extends AbstractCalc implements TripleExpression {
    public Subtract(TripleExpression firstNum, TripleExpression secondNum) {
        super(firstNum, secondNum);
    }

    public int evaluateImpl(int x, int y) {
        return x - y;
    }
}