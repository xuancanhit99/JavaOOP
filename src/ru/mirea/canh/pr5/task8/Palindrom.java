package ru.mirea.canh.pr5.task8;

import java.util.Scanner;

public class Palindrom {
    public static boolean isPalindrom(String str) {
        if(str.length() == 0 || str.length() == 1) {
            return true;
        }
        else {
            if(str.charAt(0) != str.charAt(str.length() - 1))
                return false;
            else
                return isPalindrom(str.substring(1, str.length()-1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if(isPalindrom(str))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
