package Java_Strings.Level-01;

import java.util.Scanner;

public class IndexOutOfBoundsDemo {

    public static void causeError(String text) {
        System.out.println(text.charAt(text.length())); 
    }

    public static void handleError(String text) {
        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds handled!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        handleError(text);
    }
}
