package service.implementation;

import Entity.*;
import service.MatchManager;

import java.util.List;
import java.util.Random;

public class MatchManagerImpl implements MatchManager {
    @Override
    public void start(Match match) {
        List<Player> players = match.getPlayers();
        Board board = match.getB();
        List<Snake> snakes = board.getSnakes();
        List<Ladder> ladders = board.getLadders();
    int winner=0;
        while(winner!=1){
            for(Player player:players){
                int position = player.getPosition();
                int dice = throwDice();
                position = position + dice;
                position = useLadder(ladders,position);
                position = biteSnake(snakes,position);
                if(position == board.getSize())
                {
                    System.out.println("Winner"+player.getName());
                    winner = 1;
                    break;
                }
                if(position>board.getSize()){
                    position = player.getPosition();
                }
                player.setPosition(position);
                System.out.println(player.getName()+" rolled a dice "+dice+" and now at position: "+player.getPosition());
            }
        }
    }
    int useLadder(List<Ladder> ladders, int position){
        for(Ladder ladder:ladders){
            if(ladder.getStratPos() == position)
            {
                return ladder.getEndPos();
            }
        }
        return position;
    }

    int biteSnake(List<Snake> snakes, int position){
        for(Snake snake:snakes){
            if(snake.getStratPos() == position)
            {
                return snake.getEndPos();
            }
        }
        return position;
    }
    int throwDice(){
        Random random = new Random();
        return random.nextInt(6)+1;
    }
}
