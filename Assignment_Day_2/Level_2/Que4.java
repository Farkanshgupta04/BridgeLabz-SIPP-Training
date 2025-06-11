package Assignment_Day_2.Level_2;

import java.util.Scanner;

public class Que4 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        double distanceInFeet = scanner.nextDouble();

        double distanceYards = distanceInFeet / 3;
        double distanceMiles = distanceYards / 1760;

        System.out.println("The distance in yards is " + distanceYards + " while the distance in miles is " + distanceMiles);
        
    }

}
