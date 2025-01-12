package Entity;
public class Board {
    private final char[][] grid;
    private int movesCount;

    public Board() {
        grid = new char[3][3];
        initializeBoard();
    }

    private void initializeBoard() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                grid[row][col] = '-';
            }
        }
        movesCount = 0;
    }

    public synchronized void makeMove(int row, int col, char symbol) {
        if (row < 0 || row >= 3 || col < 0 || col >= 3 || grid[row][col] != '-') {
            throw new IllegalArgumentException("Invalid move!");
        }
        grid[row][col] = symbol;
        movesCount++;
    }

    public boolean isFull() {
        return movesCount == 9;
    }

    public boolean hasWinner() {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (grid[i][0] != '-' && grid[i][0] == (grid[i][1]) && grid[i][1]==(grid[i][2])) {
                return true;
            }
            if (grid[0][i] != '-' && grid[0][i]==(grid[1][i]) && grid[1][i]==(grid[2][i])) {
                return true;
            }
        }
        if (grid[0][0] != '-' && grid[0][0]==(grid[1][1]) && grid[1][1]==(grid[2][2])) {
            return true;
        }
        if (grid[0][2] != '-' && grid[0][2]==(grid[1][1]) && grid[1][1]==(grid[2][0])) {
            return true;
        }
        return false;
    }
    public void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print((grid[i][j] == '-' ? " " : grid[i][j]));
                if (j < 2) System.out.print(" | ");
            }
            System.out.println();
            if (i < 2) System.out.println("---------");
        }
    }
}
