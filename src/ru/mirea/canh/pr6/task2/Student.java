package ru.mirea.canh.pr6.task2;

public class Student {
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

    public void showInfo() {
        System.out.printf("%-5s %15s %15s %15s \n", idNumber, name, GPA, GpaAtoF());
    }
}
