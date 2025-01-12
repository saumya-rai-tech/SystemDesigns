package Entity;

public class Snake {
    private int stratPos;
    private int endPos;

    public int getStratPos() {
        return stratPos;
    }

    public void setStratPos(int stratPos) {
        this.stratPos = stratPos;
    }

    public int getEndPos() {
        return endPos;
    }

    public void setEndPos(int endPos) {
        this.endPos = endPos;
    }

    public Snake(int stratPos, int endPos) {
        if(stratPos < endPos){
            throw new IllegalArgumentException("Start Position should be greater than End Position");
        }
        this.stratPos = stratPos;
        this.endPos = endPos;
    }
}
