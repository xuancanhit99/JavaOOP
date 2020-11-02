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
    protected double evaluate(double lhs, double rhs) {
        return lhs / rhs;
    }
}
