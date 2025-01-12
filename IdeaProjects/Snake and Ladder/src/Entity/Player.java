package Entity;

public class Player {
    private String name;

    public Player(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    private int position;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player(String name, int position) {
        this.name = name;
        this.position = position;
    }
}
