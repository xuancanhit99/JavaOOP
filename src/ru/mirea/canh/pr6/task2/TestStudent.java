package ru.mirea.canh.pr6.task2;

import java.util.Scanner;

public class TestStudent {
    public static Scanner sc = new Scanner(System.in);

    public static void inputInfo(Student st) {
        System.out.print("Enter student ID: ");
        st.setIdNumber(sc.nextInt());
        sc.nextLine();
        System.out.print("Enter student's name: ");
        st.setName(sc.nextLine());
        System.out.print("Enter math scores: ");
        st.setScoresMath(sc.nextInt());
        System.out.print("Enter literary scores: ");
        st.setScoresLiterary(sc.nextInt());
        System.out.print("Enter english scores: ");
        st.setScoresEnglish(sc.nextInt());
        System.out.println("");
    }
    public static void main(String[] args) {
        Student[] stu = null;
        int n = 0;
        boolean flag = true;
        do {
            System.out.println("1. Input info student.");
            System.out.println("2. Sort students by id.");
            System.out.println("3. Export student list.");
            System.out.println("Enter another number to exit.");
            System.out.print("Please choose: ");
            switch (sc.nextInt()) {
                case 1:
                    System.out.print("Enter the number of students: ");
                    n = sc.nextInt();
                    stu = new Student[n];
                    for(int i=0; i<n; i++) {
                        System.out.println("Student " + (i+1) + ": ");
                        stu[i] = new Student();
                        inputInfo(stu[i]);
                    }
                    break;
                case 2:
                    SortingStudentsByiDNumber sort = new SortingStudentsByiDNumber();
                    sort.sortingStudent(stu);
                    System.out.println("Sorted students by id.");
                    break;
                case 3:
                    System.out.printf("%-5s %15s %15s %15s %15s %15s \n", "ID", "Name", "MathScores", "LiteraryScores", "EnglishScores", "AverageOfSubjects");
                    for (int i=0; i<stu.length; i++) {
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
