package Java_Control_Flow.Level_3;

import java.util.Scanner;

public class BMI_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight in kg: ");
        double weight = sc.nextDouble();

        System.out.print("Enter height in cm: ");
        double heightCm = sc.nextDouble();

        double heightM = heightCm / 100;

        double bmi = weight / (heightM * heightM);

        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            status = "Normal";
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        System.out.println("Your BMI is " + bmi);
        System.out.println("Weight Status: " + status);

        sc.close();
    }
}