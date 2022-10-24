import java.util.Scanner;

public class Start {

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello this my Tic Tac Toe game").append(System.lineSeparator());
        stringBuilder.append("If you want to play - type (1-9)");
        return stringBuilder.toString();
    }
}
