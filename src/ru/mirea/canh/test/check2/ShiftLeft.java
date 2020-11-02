package ru.mirea.canh.test.check2;

public class ShiftLeft extends AbstractCalc implements TripleExpression {
    public ShiftLeft(TripleExpression firstNum, TripleExpression secondNum) {
        super(firstNum, secondNum);
    }

    public int evaluateImpl(int x, int y) {
        return x << y;
    }
}