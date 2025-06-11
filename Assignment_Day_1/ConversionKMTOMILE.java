package Assignment_Day_1;

import java.util.Scanner;

public class ConversionKMTOMILE {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        double kilometers = scanner.nextDouble();

        double miles = kilometers * 0.621371;

        System.out.println("The distance in miles is: " + miles);

}
}
