package ru.mirea.canh.pr11.task4;

public class Multiply extends ExpressionParser {
    public Multiply(TripleExpression first, TripleExpression second) {
        super(first, second);
    }
    public Multiply(TripleExpression first, WhileSpaceCharacters wsc, TripleExpression second) {
        super(first, second);
    }

    public Multiply(WhileSpaceCharacters wsc, TripleExpression first, TripleExpression second) {
        super(first, second);
    }

    public Multiply( TripleExpression first, TripleExpression second, WhileSpaceCharacters wsc) {
        super(first, second);
    }

    @Override
    protected int evaluate(int f, int s) throws Exception {
        if(s > 0 ? f > Integer.MAX_VALUE/s || f < Integer.MIN_VALUE/s :
                (s < -1 ? f >Integer.MIN_VALUE/s || f < Integer.MAX_VALUE/s :
                        s == -1 && f == Integer.MIN_VALUE))
            throw new OverflowException("overflow");
        return f * s;
    }
}
