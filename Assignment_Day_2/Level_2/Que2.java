package Assignment_Day_2.Level_2;

import java.util.Scanner;

public class Que2 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base in cm: ");
        double base = scanner.nextDouble();

        System.out.print("Enter height in cm: ");
        double height = scanner.nextDouble();

        double areaCm = 0.5 * base * height;
        double areaInches = areaCm / (2.54 * 2.54);

        System.out.println("The area of the triangle in square inches is " + areaInches + " and in square cm is " + areaCm);
        
    }

}
