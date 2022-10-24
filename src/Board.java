
public class Board {
    public char[][] board = {
                            {' ',' ',' '},
                            {' ',' ',' '},
                            {' ',' ',' '}};
    public void print() {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                System.out.print("|" + board[row][col]);
            }
            System.out.println("|");
            System.out.println("+-+-+-+");
        }

    }
    public void playerTurn(Player player) {
        placeMove(player.getMove(),'X');
        System.out.println("Players move");
        print();
    }

    private void placeMove(int position, char symbol) {
        switch (position) {
            case 1 -> board[0][0] = symbol;
            case 2 -> board[0][1] = symbol;
            case 3 -> board[0][2] = symbol;
            case 4 -> board[1][0] = symbol;
            case 5 -> board[1][1] = symbol;
            case 6 -> board[1][2] = symbol;
            case 7 -> board[2][0] = symbol;
            case 8 -> board[2][1] = symbol;
            case 9 -> board[2][2] = symbol;
            default -> System.out.println("Invalid");
        }
    }

    public boolean isValidMove(int computerMove) {
        switch (computerMove) {
            case 1 -> {
                return (board[0][0] == ' ');
            }
            case 2 -> {
                return (board[0][1] == ' ');
            }
            case 3 -> {
                return (board[0][2] == ' ');
            }
            case 4 -> {
                return (board[1][0] == ' ');
            }
            case 5 -> {
                return (board[1][1] == ' ');
            }
            case 6 -> {
                return (board[1][2] == ' ');
            }
            case 7 -> {
                return (board[2][0] == ' ');
            }
            case 8 -> {
                return (board[2][1] == ' ');
            }
            case 9 -> {
                return (board[2][2] == ' ');
            }
            default -> {
                return false;
            }
        }
    }
    public void addComputerMove(int computerTurn) {
        placeMove(computerTurn,'O');
        System.out.println("Computers move");
        print();
    }
}
