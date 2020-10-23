package ru.mirea.canh.pr10.task2;

import java.util.Scanner;

public class Client {
    public Chair chair;
    public void sit(){
        if(chair instanceof MagicChair) {
            ((MagicChair) chair).doMagic();
            System.out.println("Magic is coming, you are ready?");
        }
        else if(chair instanceof  VictorianChair) {
            System.out.println("This chair is aged: " + ((VictorianChair) chair).getAge());
        }
        else if(chair instanceof FunctionalChair) {
            int a = 0, b = 0, sum = 0;
            boolean isDone = false;
            while (!isDone) {
                try {
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Enter a and b: ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    sum = ((FunctionalChair) chair).sum(a, b);
                    isDone = true;
                }
                catch (Exception e) {
                    System.out.println("Error, please try again!");
                }
            }
            System.out.println("Input " + a + " and " + b);
            System.out.println("Output: " + sum);
        }
    }
    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
