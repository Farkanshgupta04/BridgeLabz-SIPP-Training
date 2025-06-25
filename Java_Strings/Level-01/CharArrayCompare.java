package Java_Strings.Level-01;

import java.util.Scanner;

public class CharArrayCompare {

    static char[] customCharArray(String text) {
        char[] arr = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            arr[i] = text.charAt(i);
        }
        return arr;
    }

    static boolean compareArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = scanner.next();

        char[] manualArray = customCharArray(text);
        char[] builtInArray = text.toCharArray();

        boolean isEqual = compareArrays(manualArray, builtInArray);

        System.out.println("Are character arrays equal? " + isEqual);
    }
}
