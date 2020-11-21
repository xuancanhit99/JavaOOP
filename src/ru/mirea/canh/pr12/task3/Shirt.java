package ru.mirea.canh.pr12.task3;

public class Shirt {
    private String article, fullName, color, size;

    public Shirt(String stringToParse) {
        String [] s = stringToParse.split(",");
        article = s[0];
        fullName = s[1];
        color = s[2];
        size = s[3];
    }

    @Override
    public String toString() {
        return "Артикль: " + article + ";\nПолное название: " + fullName + ";\nЦвет: " + color + ";\nРазмер: " + size;
    }
}
