package Assignment_Day_3.Level_01;

import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        double num;

        System.out.println("Enter numbers (0 to stop):");
        while ((num = sc.nextDouble()) != 0) {
            total += num;
        }
        
        System.out.println("Total sum: " + total);
    }
}
