package ru.mirea.canh.pr5.task7;

import java.util.Scanner;

public class PrimeFactors {
    public static void printPrimeFactors(int n) {
        int i;
        if(n==1)
            System.out.println();
        else {
            for (i=2; i<=n; i++)
                if(n%i == 0) {
                    System.out.print(i + " ");
                    break;
                }
            printPrimeFactors(n/i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPrimeFactors(n);
    }
}
