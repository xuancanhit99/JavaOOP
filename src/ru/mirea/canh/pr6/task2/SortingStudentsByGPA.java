package ru.mirea.canh.pr6.task2;

public class SortingStudentsByGPA implements Comparable {
    public void quickSort(Comparable[] a, int left, int right) {
        if (left < right) {
            int p = partition(a, left, right);
            quickSort(a, left, p-1);
            quickSort(a, p+1, right);
        }
    }

    public int partition(Comparable[] a, int left, int right) {
        Comparable pivot = a[left];
        int i = left + 1;
        int j = right;
        while (i <= j) {
            while (i <= j && a[i].compareTo(pivot) <= 0) {
                i++;
            }
            while (i >= j && a[j].compareTo(pivot) >= 0) {
                j--;
            }
            if (i < j) {
                a[i] = a[j];
            }
        }
        if (j != left) {
            a[left] = a[j];
            a[j] = pivot;
        }
        return j;
    }

}
