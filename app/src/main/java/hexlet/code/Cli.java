package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void playerGreetings() {
        System.out.println("Welcome to the Brain Games!");
        var scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
    }
}
