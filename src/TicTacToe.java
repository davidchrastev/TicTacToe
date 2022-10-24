public class TicTacToe {
    public static void main(String[] args) {
        Start start = new Start();
        Board board = new Board();
        Player player = new Player();
        Computer computer = new Computer();
        System.out.println(start);

        while (true) {
            board.addPlayerMove(player);
            board.addComputerMove(computer.move());
            if (board.playerWon()) {
                System.out.println("YOU WONNN");
            }
            if (board.computerWon()) {
                System.out.println("Sorry too powerful");
            }
            if (board.itsADraw()) {
                System.out.println("It's a tie");
            }
        }
    }

}

