package Java_Strings.Level-01;

import java.util.Scanner;

public class ArrayIndex {

    public static void causeArrayIndex(String[] names) {
        System.out.println(names[names.length]); 
    }

    public static void handleArrayIndex(String[] names) {
        try {
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException!");
        } catch (RuntimeException e) {
            System.out.println("Caught generic RuntimeException!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[3];
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.next();
        }
        
        handleArrayIndex(names);
    }
}
