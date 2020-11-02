package ru.mirea.canh.pr11.task4;

public class Add extends ExpressionParser {
    public Add(TripleExpression first, TripleExpression second) {
        super(first, second);
    }

    public Add(TripleExpression first, WhileSpaceCharacters wsc, TripleExpression second) {
        super(first, second);
    }

    public Add(WhileSpaceCharacters wsc, TripleExpression first, TripleExpression second) {
        super(first, second);
    }

    public Add( TripleExpression first, TripleExpression second, WhileSpaceCharacters wsc) {
        super(first, second);
    }



    @Override
    protected int evaluate(int f, int s) throws Exception {
        if(s > 0 ? f > Integer.MAX_VALUE - s : f < Integer.MIN_VALUE - s)
            throw new OverflowException("overflow");
        return f + s;
    }
}
