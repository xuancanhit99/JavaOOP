package ru.mirea.canh.pr5.task4;

import java.util.Scanner;

public class CountNumber {
    public static int count(int k, int s) {
        if(k==0)
            return s==0?1:0;
        if(s==0)
            return 1;
        int memo = 0;
        for(int i=0; i<=9; i++) {
            if (s - i >= 0)
                memo += count(k - 1, s - i);
        }
        return memo;
    }

    public static int FCount(int k, int s) {
        int memo = 0;
        for(int i=1; i<=9; i++) {
            if (s - i >= 0)
                memo += count(k - 1, s - i);
        }
        return memo;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int s = sc.nextInt();
        System.out.println(FCount(k, s));
    }
}
