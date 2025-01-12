import Entity.*;
import service.MatchManager;
import service.implementation.MatchManagerImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Board Size: ");
        int size = sc.nextInt();
        System.out.println("Enter Snake Size: ");
        int sizeSnake = sc.nextInt();
        List<Snake> snakes = new ArrayList<>();
        for(int i = 0;i<sizeSnake;i++){

            System.out.println("Enter Snake Start position: ");
            int start = sc.nextInt();

            System.out.println("Enter Snake End position: ");
            int end = sc.nextInt();
            Snake snake = new Snake(start,end);
            snakes.add(snake);
        }

        System.out.println("Enter Ladder Size: ");
        int sizeLadder = sc.nextInt();
        List<Ladder> ladders = new ArrayList<>();
        for(int i = 0;i<sizeLadder;i++){
            System.out.println("Enter Ladder Start position: ");
            int start = sc.nextInt();
            System.out.println("Enter Ladder End position: ");
            int end = sc.nextInt();
            Ladder ladder = new Ladder(start,end);
            ladders.add(ladder);
        }

        System.out.println("Enter no. of Players: ");
        int playerSize = sc.nextInt();
        List<Player> players = new ArrayList<>();
        for(int i = 0;i<playerSize;i++){
            System.out.println("Enter Players name: ");
            String name = sc.next();
            Player player = new Player(name,0);
            players.add(player);
        }

        Board board = new Board(size,ladders,snakes);
        Match match = new Match(board,players);
        MatchManager matchManager = new MatchManagerImpl();
        matchManager.start(match);
    }
}