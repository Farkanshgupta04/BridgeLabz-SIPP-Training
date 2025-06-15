package Java_Control_Flow.Level_3;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for month, day, and year
        System.out.print("Enter month: ");
        int m = sc.nextInt();
        System.out.print("Enter day: ");
        int d = sc.nextInt();
        System.out.print("Enter year: ");
        int y = sc.nextInt();

        if (y < 1582) {
            System.out.println("The year must be greater than or equal to 1582.");
        } else {
            int y0 = y - (14 - m) / 12;
            int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
            int m0 = m + 12 * ((14 - m) / 12) - 2;
            int d0 = (d + x + (31 * m0) / 12) % 7;

            System.out.println("The day of the week is: " + d0);
        }

        sc.close();
    }
}
