package ru.mirea.canh.pr7.task4;

import java.util.*;

public class GameUsingLinkedList {
    public static Scanner sc = new Scanner(System.in);
    public static void printDequeue(LinkedList<Integer> player) {
        for(int i=0; i<player.size(); i++) {
            System.out.print( player.get(i) + " ");
        }
    }
    public static void gameCard(int N) { // N: number of card
        LinkedList<Integer> player1 = new LinkedList<>();
        LinkedList<Integer> player2 = new LinkedList<>();
        for(int i = 0; i < N/2; i++)
            player1.addLast(sc.nextInt());
        for(int i = 0; i < N/2; i++)
            player2.addLast(sc.nextInt());

        int moves = 0;
        for(; !player1.isEmpty() && !player2.isEmpty() && moves <= 200000; moves++) {
            int ac = player1.removeFirst();
            int bc = player2.removeFirst();

            LinkedList<Integer> win;
            if(ac == 0 && bc == N - 1)
                win = player1;
            else if(bc == 0 && ac == N - 1)
                win = player2;
            else if(ac > bc)
                win = player1;
            else
                win = player2;

            win.addLast(ac);
            win.addLast(bc);
        }
        if(player1.isEmpty())
            System.out.println("second " + moves);
        else if(player2.isEmpty())
            System.out.println("first " + moves);
        else
            System.out.println("botva");
    }
}
