package firstjavaprogram.StepikModule3;

import java.util.Scanner;

public class StepikModule3 {
    final static int PASSWORD = 133976;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int actualPassword = scanner.nextInt();

        if (actualPassword == PASSWORD){
            System.out.println("Hello, Agent");
        } else {
            System.out.println("Access denied");
        }

        int value = 6;
        int value2 = 7;

    }
}
