package Java_Control_Flow.Level_3;

import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0, temp = number;

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        System.out.println(number + (number % sum == 0 ? " is a Harshad Number." : " is not a Harshad Number."));
        sc.close();
    }
}