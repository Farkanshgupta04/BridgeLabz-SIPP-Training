package Java_Control_Flow.Level_1;

import java.util.Scanner;

public class FactorialFor {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 0) {
            int factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.println("Factorial: " + factorial);
        } else {
            System.out.println("Not a natural number.");
        }
        sc.close();
    }

}
