public class TicTacToe {
    public static void main(String[] args) {
        Start start = new Start();
        System.out.println(start);
        Board board = new Board();
        Player player = new Player();
        board.playerTurn(player);
        Computer computer = new Computer();
        board.addComputerMove(computer.move());


    }
}

