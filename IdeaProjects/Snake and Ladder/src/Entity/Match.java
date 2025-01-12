package Entity;

import java.util.List;

public class Match {

    private Board board;
    List<Player> players;
    public Board getB() {
        return board;
    }

    public void setB(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Match(Board board, List<Player> players) {
        this.board = board;
        this.players = players;
    }


}
