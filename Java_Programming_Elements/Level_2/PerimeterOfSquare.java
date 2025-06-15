package Java_Programming_Elements.Level_2;

import java.util.Scanner;

public class PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter perimeter: ");
        double perimeter = sc.nextDouble();

        System.out.println("The length of the side is " + (perimeter / 4) + " whose perimeter is " + perimeter);
        sc.close();
    }

}
