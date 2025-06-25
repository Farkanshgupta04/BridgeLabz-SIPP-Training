package Java_Strings.Level-01;

import java.util.Scanner;

public class NumberFormat {

    public static void causeNumberFormat(String input) {
        int num = Integer.parseInt(input); 
        System.out.println("Parsed Number: " + num);
    }

    public static void handleNumberFormat(String input) {
        try {
            int num = Integer.parseInt(input);
            System.out.println("Parsed Number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException!");
        } catch (RuntimeException e) {
            System.out.println("Caught generic RuntimeException!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        handleNumberFormat(input);
    }
}
