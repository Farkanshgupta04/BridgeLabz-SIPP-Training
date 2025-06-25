package Java_Strings.Level-02;

import java.util.Scanner;

public class RockPaperScissors {

    static String getComputerChoice() {
        String[] choices = {"rock", "paper", "scissors"};
        return choices[(int)(Math.random() * 3)];
    }

    static int winner(String user, String comp) {
        if (user.equals(comp)) return 0;
        if ((user.equals("rock") && comp.equals("scissors")) ||
            (user.equals("scissors") && comp.equals("paper")) ||
            (user.equals("paper") && comp.equals("rock")))
            return 1;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userWins = 0, compWins = 0, draws = 0;

        System.out.print("How many games? ");
        int rounds = sc.nextInt();

        for (int i = 0; i < rounds; i++) {
            System.out.print("\nChoose rock/paper/scissors: ");
            String user = sc.next().toLowerCase();
            String comp = getComputerChoice();

            System.out.println("Computer chose: " + comp);
            int result = winner(user, comp);

            if (result == 1) { userWins++; System.out.println("You win!"); }
            else if (result == -1) { compWins++; System.out.println("Computer wins!"); }
            else { draws++; System.out.println("It's a draw."); }
        }

        double userRate = (userWins * 100.0) / rounds;
        double compRate = (compWins * 100.0) / rounds;

        System.out.println("\nGame Summary:");
        System.out.printf("User Wins: %d (%.2f%%)\n", userWins, userRate);
        System.out.printf("Computer Wins: %d (%.2f%%)\n", compWins, compRate);
        System.out.println("Draws: " + draws);
    }
}
