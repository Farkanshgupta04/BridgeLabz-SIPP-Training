package Assignment_Day_2.Level_1;

import java.util.Scanner;

public class Que10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your height in cm: ");
        double heightCm = input.nextDouble();

        double heightInches = heightCm / 2.54;
        double heightFeet = heightInches / 12;

        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + heightFeet + " and inches is " + heightInches);
        
    }

}
