package Java_Strings.Level-02;

import java.util.Random;

public class GradeCard {

    static int[][] generateScores(int students) {
        Random rand = new Random();
        int[][] scores = new int[students][3];
        for (int i = 0; i < students; i++) {
            scores[i][0] = 40 + rand.nextInt(61); // Physics
            scores[i][1] = 40 + rand.nextInt(61); // Chemistry
            scores[i][2] = 40 + rand.nextInt(61); // Math
        }
        return scores;
    }

    static String grade(double percent) {
        if (percent >= 90) return "A+";
        if (percent >= 80) return "A";
        if (percent >= 70) return "B";
        if (percent >= 60) return "C";
        if (percent >= 50) return "D";
        return "F";
    }

    public static void main(String[] args) {
        int[][] scores = generateScores(5);

        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-5s\n", 
            "Physics", "Chemistry", "Math", "Total", "Percent", "Grade");
        System.out.println("-------------------------------------------------------------");

        for (int[] student : scores) {
            int total = student[0] + student[1] + student[2];
            double percent = (total / 3.0);
            percent = Math.round(percent * 100.0) / 100.0;
            String grade = grade(percent);

            System.out.printf("%-10d %-10d %-10d %-10d %-10.2f %-5s\n", 
                student[0], student[1], student[2], total, percent, grade);
        }
    }
}
