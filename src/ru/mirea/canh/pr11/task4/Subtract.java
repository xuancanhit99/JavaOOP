package ru.mirea.canh.pr11.task4;

public class Subtract extends ExpressionParser {
    public Subtract(TripleExpression first, TripleExpression second) {
        super(first, second);
    }
    public Subtract(TripleExpression first, WhileSpaceCharacters wsc, TripleExpression second) {
        super(first, second);
    }

    public Subtract(WhileSpaceCharacters wsc, TripleExpression first, TripleExpression second) {
        super(first, second);
    }

    public Subtract( TripleExpression first, TripleExpression second, WhileSpaceCharacters wsc) {
        super(first, second);
    }

    @Override
    protected double evaluate(double lhs, double rhs) {
        return lhs - rhs;
    }
}
