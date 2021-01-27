package ru.mirea.canh.testt;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        String a = "me test";
        String b = "this is";
        String c;
        switch(a){
            case "MY TEST" :   c =a + b;
                break;
            case "My Test" :   c =a + b;
                break;
            case "My+Test" :   c =a + b;
                break;
            default : c =a + a;
        }
        System.out.println( c );

    }
}
