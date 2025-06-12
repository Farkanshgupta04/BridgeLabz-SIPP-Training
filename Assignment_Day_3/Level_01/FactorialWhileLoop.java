package Assignment_Day_3.Level_01;

import java.util.Scanner;

public class FactorialWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        if (n >= 0) {
            long factorial = 1;
            int i = 1;

            while (i <= n) {
                factorial *= i;
                i++;
            }

            System.out.println("Factorial of " + n + " is " + factorial);
        } else {
            System.out.println("Please enter a valid positive integer.");
        }
    }
}
