import java.util.Scanner;

public class Player extends Board {
    Scanner scanner = new Scanner(System.in);
    public int move;

    public int getMove() {
        return move = Integer.parseInt(scanner.nextLine());
    }


}
