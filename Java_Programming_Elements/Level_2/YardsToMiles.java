package Java_Programming_Elements.Level_2;

import java.util.Scanner;

public class YardsToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        double feet = sc.nextDouble();

        double yards = feet / 3;
        double miles = feet / (1760 * 3);

        System.out.println("The distance in yards is " + yards + " while the distance in miles is " + miles);
        sc.close();
    }

}
