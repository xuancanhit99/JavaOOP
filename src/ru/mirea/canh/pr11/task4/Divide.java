package ru.mirea.canh.pr11.task4;

public class Divide extends ExpressionParser {
    public Divide(TripleExpression first, TripleExpression second) {
        super(first, second);
    }

    public Divide(TripleExpression first, WhileSpaceCharacters wsc, TripleExpression second) {
        super(first, second);
    }

    public Divide(WhileSpaceCharacters wsc, TripleExpression first, TripleExpression second) {
        super(first, second);
    }

    public Divide( TripleExpression first, TripleExpression second, WhileSpaceCharacters wsc) {
        super(first, second);
    }



    @Override
    protected int evaluate(int f, int s) throws Exception {
        if((f == Integer.MIN_VALUE) && (s == -1))
            throw new OverflowException("overflow");
        if(s == 0)
            throw new DivideByZeroException();
        return f/s;
    }
}

