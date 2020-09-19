package ru.mirea.canh.pr5.task6;

public class PrimeNumber {
    public static int Prime(int n, int i) {
        int sum_temp = 0;
        if(i==n) return 1;
        else
            if(n%i==0)
                sum_temp = 1;
            return (sum_temp +Prime(n, i+1));
    }

    public static void main(String[] args) {
        System.out.println(Prime(8, 2));
    }
}
