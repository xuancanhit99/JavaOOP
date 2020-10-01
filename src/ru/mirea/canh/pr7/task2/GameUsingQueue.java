package ru.mirea.canh.pr7.task2;

import java.util.*;

public class GameUsingQueue {
    public static Scanner sc = new Scanner(System.in);
    public static void printStack(Queue<Integer> player) {
        Iterator<Integer> iter = player.iterator();
        while (iter.hasNext()) {
            Integer val = iter.next();
            System.out.print(val + " ");
        }
    }
    public static void gameCard(int N) { // N: number of card
        Queue<Integer> player1 = new LinkedList<Integer>();
        Queue<Integer> player2 = new LinkedList<Integer>();
        for(int i = 0; i < N/2; i++)
            player1.offer(sc.nextInt());
        for(int i = 0; i < N/2; i++)
            player2.offer(sc.nextInt());

        int moves = 0;
        for(; !player1.isEmpty() && !player2.isEmpty() && moves <= 200000; moves++) {
            int ac = player1.poll();
            int bc = player2.poll();

            Queue<Integer> win;
            if(ac == 0 && bc == N - 1)
                win = player1;
            else if(bc == 0 && ac == N - 1)
                win = player2;
            else if(ac > bc)
                win = player1;
            else
                win = player2;

            win.offer(ac);
            win.offer(bc);
        }
        if(player1.isEmpty())
            System.out.println("second " + moves);
        else if(player2.isEmpty())
            System.out.println("first " + moves);
        else
            System.out.println("botva");
    }
}
