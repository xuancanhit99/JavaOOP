package ru.mirea.canh.pr6.task1;

public class SortingStudentsByiDNumber {
    public void sortingStudent(Student[] stu) {
        //Insertion Sort
        for(int i=0; i<stu.length; i++) {
            Student stemp  = stu[i];
            int x = stu[i].getIdNumber();
            int y = i;
            while (y > 0 && stu[y-1].getIdNumber() > x) {
                stu[y] = stu[y-1];
                y--;
            }
            stu[y] = stemp;
        }
    }
}
