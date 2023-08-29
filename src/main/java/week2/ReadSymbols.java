package week2;
import java.io.EOFException;
import java.io.IOException;

public class ReadSymbols {
    public static void main(String[] args) throws IOException {
        char ch;
        System.out.println("Click on the appropriate button and ENTER: ");
        ch = (char) System.in.read();
        System.out.println("You have clicked on: " + ch);
    }
}
