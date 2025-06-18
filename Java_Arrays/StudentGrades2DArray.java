package Java_Arrays;

import java.util.Scanner;

public class StudentGrades2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();

        int[][] marks = new int[numStudents][3]; 
        double[] percentages = new double[numStudents]; 
        String[] grades = new String[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                while (true) {
                    System.out.print("Subject " + (j + 1) + " marks: ");
                    marks[i][j] = sc.nextInt();
                    if (marks[i][j] >= 0) break;
                    System.out.println("Invalid marks! Please enter positive values.");
                }
            }
        }

        for (int i = 0; i < numStudents; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = total / 3.0;

            if (percentages[i] >= 80) {
                grades[i] = "A";
            } else if (percentages[i] >= 70) {
                grades[i] = "B";
            } else if (percentages[i] >= 60) {
                grades[i] = "C";
            } else if (percentages[i] >= 50) {
                grades[i] = "D";
            } else if (percentages[i] >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }

        System.out.println("\nStudent Marks, Percentage, and Grades:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + ": Physics=" + marks[i][0] + ", Chemistry=" + marks[i][1] +
                    ", Maths=" + marks[i][2] + " | Percentage=" + percentages[i] + "% | Grade=" + grades[i]);
        }
    }
}
