
public class Board {
    public char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}};

    public void print() {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                System.out.print("|" + board[row][col]);
            }
            System.out.println("|");
            System.out.println("+-+-+-+");
        }

    }

    public void addPlayerMove(Player player) {
        placeMove(player.getMove(), 'X');
        System.out.println("Players move ");
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
        Computer computer = new Computer();
        if (isValidMove(computerTurn)) {
            System.out.println("Computer move " + computerTurn);
            placeMove(computerTurn, 'O');
        } else {
            System.out.println("Computer chose wrong");
            System.out.println("But i will give him a chance");
            int random = computer.move();
            if (isValidMove(random)) {
                placeMove(random, 'O');
            }

        }

        print();
    }
    public boolean itsADraw() {
        String draw = check();
        if (draw.equals(null)) {
            return true;
        }
        return false;
    }

    public boolean playerWon() {
        String checkPlayerWon = check();
        assert checkPlayerWon != null;
        if (checkPlayerWon.equals("XXX")) {
            return true;
        }
        return false;
    }
    public boolean computerWon() {
        String check = check();
        if (check.equals("OOO")) {
            return true;
        }
        return false;
    }

    private String check() {
        for (int a = 0; a < 8; a++) {
            String line = null;

            switch (a) {
                case 0:
                    line = board[0] + "" + board[1] + "" + board[2];
                    break;
                case 1:
                    line = board[3] + "" + board[4] + "" + board[5];
                    break;
                case 2:
                    line = board[6] + "" + board[7] + "" + board[8];
                    break;
                case 3:
                    line = board[0] + "" + board[3] + "" + board[6];
                    break;
                case 4:
                    line = board[1] + "" + board[4] + "" + board[7];
                    break;
                case 5:
                    line = board[2] + "" + board[5] + "" + board[8];
                    break;
                case 6:
                    line = board[0] + "" + board[4] + "" + board[8];
                    break;
                case 7:
                    line = board[2] + "" + board[4] + "" + board[6];
                    break;
            }
            return line;

        }
        return null;
    }
}
