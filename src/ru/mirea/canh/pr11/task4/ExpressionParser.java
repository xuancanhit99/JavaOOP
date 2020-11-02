package ru.mirea.canh.pr11.task4;

// Phan thuc bieu thuc 2 toan hang va 1 toan tu
public abstract class ExpressionParser implements TripleExpression {
    final TripleExpression first;
    final TripleExpression second;

    public ExpressionParser(TripleExpression first, TripleExpression second) {
        this.first = first;
        this.second = second;
    }

    public double evaluate(double x, double y, double z) {
        return evaluate(first.evaluate(x, y, z), second.evaluate(x, y, z));
    }

    protected abstract double evaluate(double lhs, double rhs);
}
