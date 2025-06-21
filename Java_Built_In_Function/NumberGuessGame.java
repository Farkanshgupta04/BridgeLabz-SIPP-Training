import java.util.Scanner;
import java.util.Random;

public class NumberGuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int low = 1, high = 100, guess;
        String feedback;

        System.out.println("Think of a number between 1 and 100...");

        while (true) {
            guess = (low + high) / 2;
            System.out.println("Is your number " + guess + "? (Enter 'high', 'low', or 'correct')");
            feedback = sc.nextLine();

            if (feedback.equalsIgnoreCase("correct")) {
                System.out.println("Yay! I guessed it.");
                break;
            } else if (feedback.equalsIgnoreCase("low")) {
                low = guess + 1;
            } else if (feedback.equalsIgnoreCase("high")) {
                high = guess - 1;
            } else {
                System.out.println("Please enter valid feedback.");
            }
        }
        sc.close();
    }
}