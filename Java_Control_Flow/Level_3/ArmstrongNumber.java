package Java_Control_Flow.Level_3;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int originalNumber = number, sum = 0;

        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            sum += Math.pow(digit, 3);
            originalNumber /= 10;
        }

        System.out.println("Is the number " + number + " an Armstrong number? " + (number == sum));
        sc.close();
    }
}