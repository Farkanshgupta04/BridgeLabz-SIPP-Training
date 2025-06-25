package Java_Strings.Level-02;

import java.util.Scanner;

public class StringLengthSafe {
    static int getLength(String text) {
        char[] chars = text.toCharArray(); // avoids charAt with out-of-bounds
        int count = 0;
        for (char c : chars) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int manualLength = getLength(input);
        int builtInLength = input.length();

        System.out.println("Manual Length: " + manualLength);
        System.out.println("Built-in Length: " + builtInLength);
    }
}