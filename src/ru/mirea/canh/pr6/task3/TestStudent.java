package ru.mirea.canh.pr6.task3;
import java.util.*;

public class TestStudent {
    public static Scanner sc = new Scanner(System.in);


    public static void inputInfo(Student st) {
        System.out.print("Enter student ID: ");
        st.setIdNumber(sc.nextInt());
        sc.nextLine();
        System.out.print("Enter student's name: ");
        st.setName(sc.nextLine());
        System.out.print("Enter GPA scores: ");
        st.setGPA(sc.nextFloat());
        System.out.println("");
    }
    public static void main(String[] args) {
        Student[] stu = new Student[100];
        Student[] stu1 = null;
        Student[] stu2 = null;
        int n1 = 0;
        int n2 = 0;
        boolean flag = true;
        do {
            System.out.println("1. Input info student list 1.");
            System.out.println("2. Input info student list 2.");
            System.out.println("3. Merge and sort the list of students.");
            System.out.println("4. Export student full list.");
            System.out.println("Enter another number to exit.");
            System.out.print("Please choose: ");
            switch (sc.nextInt()) {
                case 1:
                    System.out.print("Enter the number of students list 1: ");
                    n1 = sc.nextInt();
                    stu1 = new Student[n1];
                    for(int i=0; i<n1; i++) {
                        System.out.println("Student " + (i+1) + ": ");
                        stu1[i] = new Student();
                        inputInfo(stu1[i]);
                    }
                    break;

                case 2:
                    System.out.print("Enter the number of students list 2: ");
                    n2 = sc.nextInt();
                    stu2 = new Student[n2];
                    for(int i=0; i<n2; i++) {
                        System.out.println("Student " + (i+1) + ": ");
                        stu2[i] = new Student();
                        inputInfo(stu2[i]);
                    }
                    break;
                case 3:
                    MergeSort mer = new MergeSort();
                    mer.concatenate(stu, stu1, n1, stu2, n2);
                    mer.mergeSort(stu, 0, n1 + n2 - 1 );

                    System.out.println("Sorted students by IdNumber.");
                    System.out.println();
                    break;
                case 4:
                    System.out.printf("%-5s %15s %15s %15s \n", "ID", "Name", "GPA", "GPA(A-F)");
                    for (int i=0; i<(n1+n2); i++) {
                        stu[i].showInfo();
                    }
                    break;
                default:
                    System.out.println("Goodbye");
                    flag = false;
                    break;
            }
        } while (flag);
    }
}