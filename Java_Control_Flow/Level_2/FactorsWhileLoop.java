package Java_Control_Flow.Level_2;

import java.util.Scanner;

public class FactorsWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(), i = 1;
        
        if (number > 0) {
            while (i <= number) {
                if (number % i == 0) {
                    System.out.println(i);
                }
                i++;
            }
        } else {
            System.out.println("Not a natural number.");
        }
        sc.close();
    }
}
