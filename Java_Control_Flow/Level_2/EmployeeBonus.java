package Java_Control_Flow.Level_2;

import java.util.Scanner;

public class EmployeeBonus {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();
        int yearsOfService = sc.nextInt();
        System.out.println(yearsOfService > 5 ? "Bonus: " + (salary * 0.05) : "No Bonus");
        sc.close();
    }

}
