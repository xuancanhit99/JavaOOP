package ru.mirea.canh.pr6.task2;
import java.lang.*;
import java.util.*;

public class Student implements Comparable {
    private String name;
    private int idNumber;
    private float GPA;

    public Student(){}

    public Student(String name, int idNumber, float GPA) {
        this.name = name;
        this.idNumber = idNumber;
        this.GPA = GPA;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public float getGPA() {
        return GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }

    public String GpaAtoF() {
        if ((GPA >= 94 && GPA <= 100) || GPA == 4)
            return "A";
        else if ((GPA >= 90 && GPA < 94) || (GPA >= 3.67 && GPA < 4))
            return "A-";
        else if ((GPA >= 87 && GPA < 90) || (GPA >= 3.33 && GPA < 3.67))
            return "B+";
        else if ((GPA >= 83 && GPA < 87) || (GPA >= 3 && GPA < 3.33))
            return "B";
        else if ((GPA >= 80 && GPA < 83) || (GPA >= 2.67 && GPA < 3))
            return "B-";
        else if ((GPA >= 77 && GPA < 80) || (GPA >= 2.33 && GPA < 2.67))
            return "C+";
        else if ((GPA >= 73 && GPA < 77) || (GPA >= 2 && GPA < 2.33))
            return "C";
        else if ((GPA >= 70 && GPA < 73) || (GPA >= 1.67 && GPA < 2))
            return "C-";
        else if ((GPA >= 60 && GPA < 70) || (GPA >= 1 && GPA < 1.67))
            return "D";
        else if ((GPA >= 5 && GPA < 60) || (GPA >= 0 && GPA < 1))
            return "F";
        else
            return "None";

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", idNumber=" + idNumber +
                ", GPA=" + GPA +
                '}';
    }


    @Override
    public int compareTo(Object o) {
        Student st = (Student)o;
        if (this.getGPA() > st.getGPA()) {
            return 1;
        }
        if (this.getGPA() < st.getGPA()) {
            return -1;
        }
        return 0;
    }


    public void quickSort(Student[] a, int left, int right) {
        if (left < right) {
            int p = partition(a, left, right);
            quickSort(a, left, p-1);
            quickSort(a, p+1, right);
        }
    }

    public int partition(Student[] a, int left, int right) {
        Student pivot = a[right];
        int i = left;
        int j = right - 1;
        while (true) {
            while (i <= j && a[i].compareTo(pivot) < 0) {
                i++;
            }
            while (j >= i && a[j].compareTo(pivot) > 0) {
                j--;
            }
            if (i >= j)
                break;


            Student temp = a[i];
            System.out.print(temp);
            a[i] = a[j];
            a[j] = temp;

            i++;
            j--;
        }
        Student temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        return i;
    }

    public void showInfo() {
        System.out.printf("%-5s %15s %15s %15s \n", idNumber, name, GPA, GpaAtoF());
    }
}
