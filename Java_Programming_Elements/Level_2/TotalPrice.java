package Java_Programming_Elements.Level_2;

import java.util.Scanner;

public class TotalPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter unit price: ");
        double unitPrice = sc.nextDouble();
        System.out.print("Enter quantity: ");
        double quantity = sc.nextDouble();

        System.out.println("The total purchase price is INR " + (unitPrice * quantity) + " if the quantity is " + quantity + " and unit price is INR " + unitPrice);
        sc.close();
    }

}
