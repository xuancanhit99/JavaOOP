package ru.mirea.canh.test;

import java.util.Scanner;
public class Sorting
{
    public static void main(String args[])
    {
        int counter, i=0, j=0, temp;
        int number[] = new int[100];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số phần tử trong mảng: ");
        counter = scanner.nextInt();
        for(i=0; i<counter; i++)
        {
            System.out.print("Phần tử "+(i+1)+": ");
            number[i] = scanner.nextInt();
        }
        System.out.println();
        System.out.println(i);
        j = i - 1;
        i = 0;
        scanner.close();
        while(i<j)
        {
            temp = number[i];
            number[i] = number[j];
            number[j] = temp;
            i++;
            j--;
        }
        System.out.print("Mảng sau khi đảo ngược: ");
        for(i=0; i<counter; i++)
        {
            System.out.print(number[i]+ "  ");
        }
    }
}