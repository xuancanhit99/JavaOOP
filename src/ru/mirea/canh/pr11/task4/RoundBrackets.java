package ru.mirea.canh.pr11.task4;

public class RoundBrackets implements TripleExpression {
    TripleExpression only;

    public RoundBrackets(TripleExpression only) {
        this.only = only;
    }

    public RoundBrackets(WhileSpaceCharacters wsc, TripleExpression only) {
        this.only = only;
    }

    public RoundBrackets(TripleExpression only, WhileSpaceCharacters wsc) {
        this.only = only;
    }

    @Override
    public double evaluate(double x, double y, double z) {
        return only.evaluate(x, y, z);
    }
}
