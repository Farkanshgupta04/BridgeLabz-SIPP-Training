package Java_Control_Flow.Level_2;

import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                System.out.println(i + " is " + (i % 2 == 0 ? "Even" : "Odd"));
            }
        } else {
            System.out.println("Not a natural number.");
        }
        sc.close();
    }
}
