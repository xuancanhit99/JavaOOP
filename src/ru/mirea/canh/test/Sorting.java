package ru.mirea.canh.test;

import java.util.*;
public class Sorting
{
    public static void main(String[] args)
    {

        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        int[] b = a;
        for(int i=0; i<3; i++) {
            System.out.print(b[i] + " ");
        }
        b[2] = 5;
        for(int i=0; i<3; i++) {
            System.out.print(a[i] + " ");
        }

    }
}