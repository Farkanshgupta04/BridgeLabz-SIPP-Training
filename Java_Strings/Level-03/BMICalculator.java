package Java_Strings.Level-03;

import java.util.Scanner;

public class BMICalculator {

    public static double calculateBMI(double weightKg, double heightCm) {
        double heightM = heightCm / 100.0;
        return weightKg / (heightM * heightM);
    }

    public static String getStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 24.9) return "Normal";
        else if (bmi < 29.9) return "Overweight";
        else return "Obese";
    }

    public static String[][] calculateBMIReport(double[][] data) {
        String[][] report = new String[10][4];
        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double height = data[i][1];
            double bmi = calculateBMI(weight, height);
            report[i][0] = String.format("%.2f", height);
            report[i][1] = String.format("%.2f", weight);
            report[i][2] = String.format("%.2f", bmi);
            report[i][3] = getStatus(bmi);
        }
        return report;
    }

    public static void displayReport(String[][] report) {
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height", "Weight", "BMI", "Status");
        for (String[] row : report) {
            System.out.printf("%-10s %-10s %-10s %-15s\n", row[0], row[1], row[2], row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] input = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter data for person " + (i + 1) + ":");
            System.out.print("Weight (kg): ");
            input[i][0] = sc.nextDouble();
            System.out.print("Height (cm): ");
            input[i][1] = sc.nextDouble();
        }

        String[][] result = calculateBMIReport(input);
        displayReport(result);
    }
}