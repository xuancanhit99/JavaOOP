package ru.mirea.canh.test.check2;

public class ShiftRight extends AbstractCalc implements TripleExpression {
    public ShiftRight(TripleExpression firstNum, TripleExpression secondNum) {
        super(firstNum, secondNum);
    }

    public int evaluateImpl(int x, int y) {
        return x >> y;
    }
}