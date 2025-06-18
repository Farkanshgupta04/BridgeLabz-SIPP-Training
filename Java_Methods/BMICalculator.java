package Java_Methods;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] bmiData = new double[10][3];
        String[] status = new String[10];

       
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            bmiData[i][0] = scanner.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            bmiData[i][1] = scanner.nextDouble();
            bmiData[i][1] /= 100; 
        }

        for (int i = 0; i < 10; i++) {
            bmiData[i][2] = calculateBMI(bmiData[i][0], bmiData[i][1]);
            status[i] = determineBMIStatus(bmiData[i][2]);
        }

        System.out.println("\nHeight (m) | Weight (kg) | BMI | Status");
        System.out.println("-----------------------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%.2f        | %.2f        | %.2f | %s%n", bmiData[i][1], bmiData[i][0], bmiData[i][2], status[i]);
        }
        
        scanner.close();
    }

    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    public static String determineBMIStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}