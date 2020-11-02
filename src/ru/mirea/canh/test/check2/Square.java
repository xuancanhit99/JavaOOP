package ru.mirea.canh.test.check2;

public class Square implements TripleExpression {
    private TripleExpression tmp;
    public Square(TripleExpression Num) {
        tmp = Num;
    }

    public int evaluate(int x, int y, int z) {
        return tmp.evaluate(x, y, z) * tmp.evaluate(x, y, z);
    }
}