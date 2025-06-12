package Assignment_Day_3.Level_01;

import java.util.Scanner;

public class RocketCountdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the countdown start number: ");
        int counter = sc.nextInt();

        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
        System.out.println("🚀 Lift off!");
    }
}