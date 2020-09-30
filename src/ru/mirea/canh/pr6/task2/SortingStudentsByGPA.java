package ru.mirea.canh.pr6.task2;

public class SortingStudentsByGPA  {
    //Quick Sort
    public static void quickSort(Student[] arr, int left, int right) {
        if (arr == null || arr.length == 0)
            return;
        if (left >= right)
            return;
        int middle = left + (right - left) / 2;
        Student pivot = arr[middle];
        int i = left, j = right;
        while (i <= j) {
            while (arr[i].compareTo(pivot) < 0) {
                i++;
            }
            while (arr[j].compareTo(pivot) > 0) {
                j--;
            }
            if (i <= j) {
                Student temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if (left < j)
            quickSort(arr, left, j);

        if (right > i)
            quickSort(arr, i, right);
    }

    public static void reverse(Student[] st, int i, int j) {
        while(i<j)
        {
            Student temp = st[i];
            st[i] = st[j];
            st[j] = temp;
            i++;
            j--;
        }
    }
}


