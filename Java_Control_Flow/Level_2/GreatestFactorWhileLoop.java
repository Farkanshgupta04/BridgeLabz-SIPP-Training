package Java_Control_Flow.Level_2;

import java.util.Scanner;

public class GreatestFactorWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(), greatestFactor = 1, counter = number - 1;

        while (counter >= 1) {
            if (number % counter == 0) {
                greatestFactor = counter;
                break;
            }
            counter--;
        }
        System.out.println("Greatest factor: " + greatestFactor);
        sc.close();
    }

}
