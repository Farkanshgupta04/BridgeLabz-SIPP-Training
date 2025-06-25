package Java_Strings.Level-01;

import java.util.Scanner;

public class IllegalArgument {

    public static void causeIllegalArgument(String text) {
        System.out.println(text.substring(5, 3)); 
    }

    public static void handleIllegalArgument(String text) {
        try {
            System.out.println(text.substring(5, 3));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException!");
        } catch (RuntimeException e) {
            System.out.println("Caught generic RuntimeException!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        handleIllegalArgument(text);
    }
}
