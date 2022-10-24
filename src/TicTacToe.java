import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String whoIsFirst = turn();
        System.out.println(whoIsFirst);
        boolean playerWon = false;
        boolean computerWon = false;
        boolean playerFirst = false;
        if (whoIsFirst.equals("player")) {
            playerFirst = true;
        }
        int row = 0;
        int col = 0;

        while (true) {

            if (checkPlayerWon(whoIsFirst) || checkComputerWon(whoIsFirst)) {
                return;
            } else {
                turn(playerFirst, row, scanner, col);
            }
        }

    }

    private static void turn(boolean playerFirst, int row, Scanner scanner, int col) {
        if (playerFirst) {
            System.out.println("Your Turn");
            row = Integer.parseInt(scanner.nextLine());
            col = Integer.parseInt(scanner.nextLine());
            int randomIndexComputer = computer();
            field[row][col] = "X";
            printField(field);
            System.out.println("This was your turn");
            int check = checkValidation(field,true,randomIndexComputer);
            field[check][check] = "O";
            printField(field);
            System.out.println("Computer's turn");
        } else {
            int randomIndexComputer = computer();
            int check = checkValidation(field,false,randomIndexComputer);
            field[check][check] = "X";
            printField(field);
            System.out.println("Computer's turn");
            row = Integer.parseInt(scanner.nextLine());
            col = Integer.parseInt(scanner.nextLine());
            field[row][col] = "O";
            printField(field);
            System.out.println("This was your turn");
        }
    }

    public static int checkValidation(String[][] field,boolean whoIsFirst, int random) {
        int placement = 0;
        if (whoIsFirst) {
            do {
                if (!field[random][random].equals("O") && !field[random][random].equals("X")) {
                    return random;
                } else {
                    placement = computer();
                    if (!field[placement][placement].equals("O") || !field[placement][placement].equals("X")) {
                        return placement;
                    }
                }
            } while (!field[placement][placement].equals("O") && !field[placement][placement].equals("X"));

        } else {
            do {
                if (!field[random][random].equals("O") && !field[random][random].equals("X")) {
                    return random;
                } else {
                    placement = computer();
                    if (!field[placement][placement].equals("O") && !field[placement][placement].equals("X")) {
                        return placement;
                    }
                }
            } while (!field[placement][placement].equals("O") && !field[placement][placement].equals("X"));
        }
        return placement;
    }
    public static void printField(String[][] field) {
        for (int row = 0; row < field.length; row++) {
            for (int col = 0; col < field.length; col++) {
                System.out.print(field[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static String[][] field = {
            {"-", "-", "-"},
            {"-", "-", "-"},
            {"-", "-", "-"}
    };

    public static String turn() {
        int opt = options.length;
        double randomWord = Math.random();
        return options[(int) (opt * randomWord)];
    }

    public static String[] options = {
            "computer", "player"
    };

    public static int computer() {
        int opt = options.length;
        double randomWord = Math.random();
        return (int) (opt * randomWord);
    }

    public static boolean checkPlayerWon(String whoIsFirst) {
        if (whoIsFirst.equals("player")) {
            if (field[0][0].equals("X")
                    && field[0][1].equals("X")
                    && field[0][2].equals("X")) {
                return true;
            } else if (field[1][0].equals("X")
                    && field[1][1].equals("X")
                    && field[1][2].equals("X")) {
                return true;
            } else if (field[2][0].equals("X")
                    && field[2][1].equals("X")
                    && field[2][2].equals("X")) {
                return true;
            } else if (field[0][0].equals("X")
                    && field[1][1].equals("X")
                    && field[2][2].equals("X")) {

            } else if (field[0][2].equals("X")
                    && field[1][1].equals("X")
                    && field[2][0].equals("X")) {
                return true;
            } else if (field[0][1].equals("X")
                    && field[1][1].equals("X")
                    && field[2][1].equals("X")) {
                return true;
            } else if (field[0][2].equals("X")
                    && field[1][2].equals("X")
                    && field[2][2].equals("X")) {
                return true;
            }
        } else {
            if (field[0][0].equals("X")
                    && field[0][1].equals("X")
                    && field[0][2].equals("X")) {
                return true;
            } else if (field[1][0].equals("X")
                    && field[1][1].equals("X")
                    && field[1][2].equals("X")) {
                return true;
            } else if (field[2][0].equals("O")
                    && field[2][1].equals("O")
                    && field[2][2].equals("O")) {
                return true;
            } else if (field[0][0].equals("O")
                    && field[1][1].equals("O")
                    && field[2][2].equals("O")) {

            } else if (field[0][2].equals("O")
                    && field[1][1].equals("O")
                    && field[2][0].equals("O")) {
                return true;
            } else if (field[0][1].equals("O")
                    && field[1][1].equals("O")
                    && field[2][1].equals("O")) {
                return true;
            } else if (field[0][2].equals("O")
                    && field[1][2].equals("O")
                    && field[2][2].equals("O")) {
                return true;
            }
        }
        return false;
    }
    public static boolean checkComputerWon(String whoIsFirst) {
        if (whoIsFirst.equals("player")) {
            if (field[0][0].equals("X")
                    && field[0][1].equals("X")
                    && field[0][2].equals("X")) {
                return true;
            } else if (field[1][0].equals("X")
                    && field[1][1].equals("X")
                    && field[1][2].equals("X")) {
                return true;
            } else if (field[2][0].equals("X")
                    && field[2][1].equals("X")
                    && field[2][2].equals("X")) {
                return true;
            } else if (field[0][0].equals("X")
                    && field[1][1].equals("X")
                    && field[2][2].equals("X")) {

            } else if (field[0][2].equals("X")
                    && field[1][1].equals("X")
                    && field[2][0].equals("X")) {
                return true;
            } else if (field[0][1].equals("X")
                    && field[1][1].equals("X")
                    && field[2][1].equals("X")) {
                return true;
            } else if (field[0][2].equals("X")
                    && field[1][2].equals("X")
                    && field[2][2].equals("X")) {
                return true;
            }
        } else {
            if (field[0][0].equals("X")
                    && field[0][1].equals("X")
                    && field[0][2].equals("X")) {
                return true;
            } else if (field[1][0].equals("X")
                    && field[1][1].equals("X")
                    && field[1][2].equals("X")) {
                return true;
            } else if (field[2][0].equals("O")
                    && field[2][1].equals("O")
                    && field[2][2].equals("O")) {
                return true;
            } else if (field[0][0].equals("O")
                    && field[1][1].equals("O")
                    && field[2][2].equals("O")) {

            } else if (field[0][2].equals("O")
                    && field[1][1].equals("O")
                    && field[2][0].equals("O")) {
                return true;
            } else if (field[0][1].equals("O")
                    && field[1][1].equals("O")
                    && field[2][1].equals("O")) {
                return true;
            } else if (field[0][2].equals("O")
                    && field[1][2].equals("O")
                    && field[2][2].equals("O")) {
                return true;
            }
        }
        return false;
    }
}

