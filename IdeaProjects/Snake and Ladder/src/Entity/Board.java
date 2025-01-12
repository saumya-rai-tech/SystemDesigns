package Entity;

import java.util.List;

public class Board {
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<Ladder> getLadders() {
        return ladders;
    }

    public void setLadders(List<Ladder> ladders) {
        this.ladders = ladders;
    }

    public List<Snake> getSnakes() {
        return snakes;
    }

    public void setSnakes(List<Snake> snakes) {
        this.snakes = snakes;
    }

    public Board(int size, List<Ladder> ladders, List<Snake> snakes) {
        this.size = size;
        this.ladders = ladders;
        this.snakes = snakes;
    }

    private int size;
    List<Ladder> ladders;
    List<Snake> snakes;

}
