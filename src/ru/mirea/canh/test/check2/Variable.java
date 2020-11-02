package ru.mirea.canh.test.check2;

public class Variable implements TripleExpression {
    private String line;

    public Variable(String Var) {
        line = Var;
    }

    public int evaluate(int x, int y, int z) {
        if (line.equals("x")) {
            return x;
        } else if (line.equals("y")) {
            return y;
        } else {
            return z;
        }
    }
}
