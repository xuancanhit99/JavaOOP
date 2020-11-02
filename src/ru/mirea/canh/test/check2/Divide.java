package ru.mirea.canh.test.check2;

public class Divide extends AbstractCalc implements TripleExpression {
    public Divide(TripleExpression firstNum, TripleExpression secondNum) {
        super(firstNum, secondNum);
    }

    public int evaluateImpl(int x, int y) {
        return x / y;
    }
}