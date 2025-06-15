package Java_Control_Flow.Level_1;

import java.util.Scanner;

public class SumUntilZero {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0, num;
        while ((num = sc.nextDouble()) != 0) {
            total += num;
        }
        System.out.println("Total sum: " + total);
        sc.close();
    }

}
