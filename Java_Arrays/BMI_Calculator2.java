package Java_Arrays;

import java.util.Scanner;

public class BMI_Calculator2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int numPersons = sc.nextInt();

       
        double[][] personData = new double[numPersons][3];
        String[] weightStatus = new String[numPersons];

        
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Enter details for Person " + (i + 1) + ":");

           
            while (true) {
                System.out.print("Weight (kg): ");
                personData[i][0] = sc.nextDouble();
                if (personData[i][0] >= 0) break;
                System.out.println("Invalid weight! Please enter positive values.");
            }

            
            while (true) {
                System.out.print("Height (meters): ");
                personData[i][1] = sc.nextDouble();
                if (personData[i][1] > 0) break;
                System.out.println("Invalid height! Please enter a positive value.");
            }

            
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

           
            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        
        System.out.println("\nHeight, Weight, BMI, and Weight Status of Individuals:");
        for (int i = 0; i < numPersons; i++) {
            System.out.printf("Person %d: Height = %.2f m, Weight = %.2f kg, BMI = %.2f, Status = %s%n",
                    (i + 1), personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
        }
    }
}
