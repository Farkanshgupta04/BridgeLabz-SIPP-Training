package Java_Strings.Level-01;

import java.util.Scanner;

public class StringCompare {

    static boolean compareUsingCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = scanner.next();
        System.out.print("Enter second string: ");
        String str2 = scanner.next();

        boolean manualCompare = compareUsingCharAt(str1, str2);
        boolean equalsCompare = str1.equals(str2);

        System.out.println("Compared using charAt(): " + manualCompare);
        System.out.println("Compared using equals(): " + equalsCompare);
        System.out.println("Do results match? " + (manualCompare == equalsCompare));
    }
}