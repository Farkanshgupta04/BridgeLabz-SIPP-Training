package Java_Arrays;

import java.util.Scanner;

public class BMI_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the number of persons: ");
        int numPersons = sc.nextInt();

        // Creating arrays to store height, weight, BMI, and weight status
        double[] heights = new double[numPersons];
        double[] weights = new double[numPersons];
        double[] bmiValues = new double[numPersons];
        String[] weightStatus = new String[numPersons];

       
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Enter details for Person " + (i + 1) + ":");
            System.out.print("Height (in meters): ");
            heights[i] = sc.nextDouble();
            System.out.print("Weight (in kg): ");
            weights[i] = sc.nextDouble();

           
            bmiValues[i] = weights[i] / (heights[i] * heights[i]);

          
            if (bmiValues[i] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmiValues[i] >= 18.5 && bmiValues[i] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmiValues[i] >= 25.0 && bmiValues[i] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        
        System.out.println("\nHeight, Weight, BMI, and Weight Status of Individuals:");
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Person " + (i + 1) + ": Height = " + heights[i] + "m, Weight = " + weights[i] + "kg, BMI = " + bmiValues[i] + ", Status = " + weightStatus[i]);
        }
    }
}
