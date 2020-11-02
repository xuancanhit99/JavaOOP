package ru.mirea.canh.test.check2;

public class Multiply extends AbstractCalc implements TripleExpression {
    public Multiply(TripleExpression firstNum, TripleExpression secondNum) {
        super(firstNum, secondNum);
    }

    public int evaluateImpl(int x, int y) {
        return x * y;
    }
}