package Java_Control_Flow.Level_2;

import java.util.Scanner;

public class PowerWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(), power = sc.nextInt();
        int result = 1, counter = 0;
        
        while (counter < power) {
            result *= number;
            counter++;
        }
        System.out.println("Power result: " + result);
        sc.close();
    }

}
