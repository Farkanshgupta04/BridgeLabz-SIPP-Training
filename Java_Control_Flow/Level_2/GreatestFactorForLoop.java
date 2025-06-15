package Java_Control_Flow.Level_2;

import java.util.Scanner;

public class GreatestFactorForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(), greatestFactor = 1;

        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }
        System.out.println("Greatest factor: " + greatestFactor);
        sc.close();
    }

}
