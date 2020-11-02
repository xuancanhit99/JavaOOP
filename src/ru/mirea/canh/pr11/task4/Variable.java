package ru.mirea.canh.pr11.task4;

public class Variable implements TripleExpression {
    private String var;

    public Variable(String var) {
        this.var = var;
    }

    public Variable(String var, WhileSpaceCharacters wsc) {
        this.var = var;
    }
    public Variable(WhileSpaceCharacters wsc, String var) {
        this.var = var;
    }

    public int evaluate(int x, int y, int z) {
        if (var.equals("x")) {
            return x;
        } else if (var.equals("y")) {
            return y;
        } else {
            return z;
        }
    }
}
