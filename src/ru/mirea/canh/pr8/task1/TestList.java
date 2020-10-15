package ru.mirea.canh.pr8.task1;

import java.util.ArrayList;

public class TestList {
    public static void main(String[] args) {
        // WaitList
        WaitList<Integer> waitList = new WaitList<>();
        waitList.add(30);
        waitList.add(31);
        waitList.add(32);
        // 30 31 32
        System.out.println(waitList.remove() + " has been removed");
        // 31 32
        System.out.println(waitList.remove() + " has been removed");
        // 32

        waitList.add(50);
        waitList.add(51);
        System.out.println(waitList);
        // 32, 50 , 51

        System.out.println(waitList.contains(50));
        // true


        //BoundedWaitList
        BoundedWaitList<Integer> boundedWaitList = new BoundedWaitList<>(5);
        boundedWaitList.add(1);
        boundedWaitList.add(2);
        boundedWaitList.add(3);
        boundedWaitList.add(4);
        boundedWaitList.add(5);
        // 1 2 3 4 5
        int a = 6;
        try {
            boundedWaitList.add(6);
        }
        catch (RuntimeException e) {
            System.out.println("Impossible add " + a + " to list");
        }

        System.out.println(boundedWaitList);
        System.out.println(boundedWaitList.remove() + " has been removed");
        System.out.println(boundedWaitList);


        //UnfairWaitList
        UnfairWaitList<Integer> unfairWaitList = new UnfairWaitList<>();
        unfairWaitList.add(21);
        unfairWaitList.add(22);
        unfairWaitList.add(23);
        unfairWaitList.add(24);
        unfairWaitList.add(25);
        System.out.println(unfairWaitList);
        // 21 22 23 24 25

        unfairWaitList.remove(23);
        System.out.println(unfairWaitList);
        // 21 22 24 25

        unfairWaitList.moveToBack(21);
        System.out.println(unfairWaitList);
        // 22 24 25 21
    }
}
