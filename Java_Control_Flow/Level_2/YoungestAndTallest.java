package Java_Control_Flow.Level_2;

import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int age1 = sc.nextInt(), age2 = sc.nextInt(), age3 = sc.nextInt();
        int height1 = sc.nextInt(), height2 = sc.nextInt(), height3 = sc.nextInt();
        
        int youngest = Math.min(age1, Math.min(age2, age3));
        int tallest = Math.max(height1, Math.max(height2, height3));
        
        System.out.println("Youngest person's age: " + youngest);
        System.out.println("Tallest person's height: " + tallest);
        
        sc.close();
    }

}
