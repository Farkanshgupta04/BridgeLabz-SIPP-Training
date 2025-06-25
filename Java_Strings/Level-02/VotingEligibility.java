package Java_Strings.Level-02;

import java.util.Random;

public class VotingEligibility {

    static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(90); 
        }
        return ages;
    }

    static String[][] evaluateVotingRights(int[] ages) {
        String[][] report = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            report[i][0] = String.valueOf(ages[i]);
            report[i][1] = (ages[i] >= 18) ? "true" : "false";
        }
        return report;
    }

    public static void main(String[] args) {
        int[] ages = generateAges(10);
        String[][] result = evaluateVotingRights(ages);

        System.out.printf("%-10s %-10s\n", "Age", "Can Vote");
        System.out.println("--------------------");
        for (String[] row : result) {
            System.out.printf("%-10s %-10s\n", row[0], row[1]);
        }
    }
}
