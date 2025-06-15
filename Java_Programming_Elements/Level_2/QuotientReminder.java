package Java_Programming_Elements.Level_2;

import java.util.Scanner;

public class QuotientReminder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("The Quotient is " + (num1 / num2) + " and Remainder is " + (num1 % num2) + " of two numbers " + num1 + " and " + num2);
        sc.close();
    }

}
