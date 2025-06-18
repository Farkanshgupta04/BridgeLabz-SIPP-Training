package Java_Arrays;

import java.util.Scanner;
import java.util.ArrayList;

public class OddEvenSeparation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Invalid input. Please enter a natural number.");
            return;
        }

        ArrayList<Integer> oddNumbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers.add(i);
            } else {
                oddNumbers.add(i);
            }
        }

        System.out.println("Odd numbers: " + oddNumbers);
        System.out.println("Even numbers: " + evenNumbers);
    }
}
