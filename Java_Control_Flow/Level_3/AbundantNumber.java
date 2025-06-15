package Java_Control_Flow.Level_3;

import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        System.out.println(number + (sum > number ? " is an Abundant Number." : " is not an Abundant Number."));
        sc.close();
    }
}