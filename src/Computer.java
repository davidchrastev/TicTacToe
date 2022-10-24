import java.util.Random;

public class Computer {
    public Random random = new Random();

    public int computerMove() {
        return random.nextInt(9) + 1;
    }
    public int move() {
        Board board = new Board();
        int move = computerMove();
        while (!board.isValidMove(move)) {
            move = computerMove();
        }
        return move;
    }
}
