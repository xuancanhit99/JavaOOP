package ru.mirea.canh.pr11.task4;

public class UnaryMinus  implements TripleExpression {
    TripleExpression only;

    public UnaryMinus(TripleExpression only) {
        this.only = only;
    }

    public UnaryMinus(WhileSpaceCharacters wsc, TripleExpression only) {
        this.only = only;
    }

    public UnaryMinus(TripleExpression only, WhileSpaceCharacters wsc) {
        this.only = only;
    }

    @Override
    public double evaluate(double x, double y, double z) {
        if(only instanceof Const)
            return (-1)*((Const) only).constant;
        else if(only instanceof Variable)
            return (-1)*only.evaluate(x, y, z);
        else if(only instanceof ExpressionParser)
            return (-1)*only.evaluate(x, y, z);
        else if(only instanceof UnaryMinus)
            return (-1)*only.evaluate(x, y, z);
        else if(only instanceof RoundBrackets)
            return (-1)*only.evaluate(x, y, z);
        else
            return 0;
    }
}
