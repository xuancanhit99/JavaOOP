package ru.mirea.canh.pr6.task3;
import java.lang.*;
import java.util.*;

public class MergeSort {
    public static void concatenate(Student[] st, Student[] st1, int n1, Student[] st2, int n2) {
        int n = n1 + n2;
        for(int i=0; i<n; i++) {
            if(i < n1) {
                st[i] = st1[i];
            } else
                st[i] = st2[i-n1];
        }
    }

    public static void merge(Student[] arr, int l, int m, int r) {
        int i, j, k;
        int n1 = m - l + 1;
        int n2 =  r - m;

        Student[] L = new Student[n1];
        Student[] R = new Student[n2];

        for (i = 0; i < n1; i++)
            L[i] = arr[l + i];
        for (j = 0; j < n2; j++)
            R[j] = arr[m + 1+ j];

        i = 0;
        j = 0;
        k = l;
        while (i < n1 && j < n2) {
            if (L[i].getIdNumber() <= R[j].getIdNumber()) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(Student[] arr, int l, int r) {
        if (l < r) {
            int m = l+(r-l)/2;
            mergeSort(arr, l, m);
            mergeSort(arr, m+1, r);
            merge(arr, l, m, r);
        }
    }
}
