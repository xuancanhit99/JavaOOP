package ru.mirea.canh.pr7.task1;

import java.util.*;

public class GameUsingStack {
    public static Scanner sc = new Scanner(System.in);
    public static void printStack(Stack<Integer> player) {
        Iterator<Integer> iter = player.iterator();
        while (iter.hasNext()) {
            Integer val = iter.next();
            System.out.print(val + " ");
        }
    }
    public static void gameCard(int N) { // N: number of card
        Stack<Integer> player1 = new Stack<Integer>();
        Stack<Integer> player2 = new Stack<Integer>();
        for(int i = 0; i < N/2; i++)
            player1.push(sc.nextInt());
        for(int i = 0; i < N/2; i++)
            player2.push(sc.nextInt());

        int moves = 0;
        for(; !player1.empty() && !player2.empty() && moves <= 200000; moves++) {
            int ac = player1.remove(0);
            int bc = player2.remove(0);

            Stack<Integer> win;
            if(ac == 0 && bc == N - 1)
                win = player1;
            else if(bc == 0 && ac == N - 1)
                win = player2;
            else if(ac > bc)
                win = player1;
            else
                win = player2;

            win.push(ac);
            win.push(bc);
        }
        if(player1.empty())
            System.out.println("second " + moves);
        else if(player2.empty())
            System.out.println("first " + moves);
        else
            System.out.println("botva");
    }
}

