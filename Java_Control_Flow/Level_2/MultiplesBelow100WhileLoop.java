package Java_Control_Flow.Level_2;

import java.util.Scanner;

public class MultiplesBelow100WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(), counter = 100;
        
        if (number > 0 && number < 100) {
            while (counter >= 1) {
                if (counter % number == 0) {
                    System.out.println(counter);
                }
                counter--;
            }
        } else {
            System.out.println("Invalid input.");
        }
        sc.close();
    }

}
