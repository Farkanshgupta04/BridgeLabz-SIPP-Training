package Assignment_Day_3.Level_01;

import java.util.Scanner;

public class RocketCountdownForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the countdown start number: ");
        int counter = sc.nextInt();

        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("🚀 Lift off!");
    }
}
