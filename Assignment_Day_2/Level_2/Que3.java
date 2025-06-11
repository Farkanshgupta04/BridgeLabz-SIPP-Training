package Assignment_Day_2.Level_2;

import java.util.Scanner;

public class Que3 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter perimeter: ");
        double perimeter = scanner.nextDouble();

        double side = perimeter / 4;

        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
        
    }

}
