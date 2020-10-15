package ru.mirea.canh.test;
import java.util.ArrayDeque;
import java.util.Scanner;


public class Sorting {
    public static void inputStack(int[] arr, ArrayDeque<Integer> ad) {
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i< arr.length;i++){
            arr[i]=scanner.nextInt();
            ad.push(arr[i]);
        }
    }
    public static void work(ArrayDeque<Integer> ad1,ArrayDeque<Integer> ad2){
        int count =0;
        while(true){
            int a=ad1.pollLast();
            int b=ad2.pollLast();

            if(a==0&&b==9){
                ad1.push(b);
                ad1.push(a);
            }
            else if(a==9&&b==0){
                ad2.push(a);
                ad2.push(b);
            }
            else if(a>b){
                ad1.push(b);
                ad1.push(a);
            }
            else if(a<b){
                ad2.push(a);
                ad2.push(b);
            }
            count++;
            if(ad1.isEmpty()) {
                System.out.println("second " + count);
                return;
            }
            else if(ad2.isEmpty()){
                System.out.println("first " + count);
                return;
            }
            else if(count>106) {
                System.out.println("botva");
                return;
            }
        }
    }
    public static void main(String[] args) {
        ArrayDeque<Integer> drunkard1 = new ArrayDeque<>();
        ArrayDeque<Integer> drunkard2 = new ArrayDeque<>();
        int[] dr1 = new int[5];
        int[] dr2 = new int[5];
        inputStack(dr1,drunkard1);
        inputStack(dr2,drunkard2);
        work(drunkard1,drunkard2);
    }
}