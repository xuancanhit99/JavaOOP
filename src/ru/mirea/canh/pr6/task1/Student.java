package ru.mirea.canh.pr6.task1;

public class Student {
    private String name;
    private int idNumber;
    private int scoresMath;
    private int scoresLiterary;
    private int scoresEnglish;

    public Student(){}

    public Student(String name, int idNumber, int scoresMath, int scoresLiterary, int scoresEnglish) {
        this.name = name;
        this.idNumber = idNumber;
        this.scoresMath = scoresMath;
        this.scoresLiterary = scoresLiterary;
        this.scoresEnglish = scoresEnglish;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void setScoresMath(int scoresMath) {
        this.scoresMath = scoresMath;
    }

    public void setScoresLiterary(int scoresLiterary) {
        this.scoresLiterary = scoresLiterary;
    }

    public void setScoresEnglish(int scoresEnglish) {
        this.scoresEnglish = scoresEnglish;
    }

    public String getName() {
        return name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public int getScoresMath() {
        return scoresMath;
    }

    public int getScoresLiterary() {
        return scoresLiterary;
    }

    public int getScoresEnglish() {
        return scoresEnglish;
    }



    public float averageOfSubjects() {
        return (float) Math.round(((float)(scoresEnglish+scoresLiterary+scoresMath)/3)*100)/100;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", idNumber=" + idNumber +
                ", scoresMath=" + scoresMath +
                ", scoresLiterary=" + scoresLiterary +
                ", scoresEnglish=" + scoresEnglish +
                '}';
    }

    public void showInfo() {
        System.out.printf("%-5s %15s %15s %15s %15s %15s \n", idNumber, name, scoresMath, scoresLiterary, scoresEnglish, averageOfSubjects());
    }
}
