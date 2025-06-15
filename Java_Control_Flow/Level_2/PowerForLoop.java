package Java_Control_Flow.Level_2;

import java.util.Scanner;

public class PowerForLoop {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(), power = sc.nextInt();
        int result = 1;
        
        for (int i = 1; i <= power; i++) {
            result *= number;
        }
        System.out.println("Power result: " + result);
        sc.close();
    }

}
