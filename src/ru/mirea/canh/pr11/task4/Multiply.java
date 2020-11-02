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
    protected double evaluate(double lhs, double rhs) {
        return lhs * rhs;
    }
}
