package ru.mirea.canh.pr5.task5;

import java.util.Scanner;

public class SumOfDigitsOfANumber {
    public static int SumOF(int N) {
        if(N > 0) {
            return N%10 + SumOF(N/10);
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(SumOF(N));
    }
}
