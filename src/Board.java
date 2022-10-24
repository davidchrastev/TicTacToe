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
    public void printMove(Player player) {
        int move = player.getMove();
        switch (move) {
            case 1:
                board[0][0] = 'X';
                break;
            case 2:
                board[0][1] = 'X';
                break;
            case 3:
                board[0][2] = 'X';
                break;
            case 4:
                board[1][0] = 'X';
                break;
            case 5:
                board[1][1] = 'X';
                break;
            case 6:
                board[1][2] = 'X';
                break;
            case 7:
                board[2][0] = 'X';
                break;
            case 8:
                board[2][1] = 'X';
                break;
            case 9:
                board[2][2] = 'X';
                break;
            default:
                System.out.println("Invalid");
                break;
        }
        print();
    }
}
