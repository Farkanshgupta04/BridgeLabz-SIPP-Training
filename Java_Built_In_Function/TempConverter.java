package Java_Built-in_Function;

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Convert (1) C to F or (2) F to C? Enter 1 or 2: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter Celsius: ");
            double c = sc.nextDouble();
            System.out.println("Fahrenheit: " + celsiusToFahrenheit(c));
        } else {
            System.out.print("Enter Fahrenheit: ");
            double f = sc.nextDouble();
            System.out.println("Celsius: " + fahrenheitToCelsius(f));
        }
    }

    static double celsiusToFahrenheit(double c) {
        return (c * 9/5) + 32;
    }

    static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5/9;
    }
}