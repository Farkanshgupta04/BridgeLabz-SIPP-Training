package Java_Strings.Level-01;

import java.util.Scanner;

public class SubstringCharAt {

    static String customSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = scanner.next();
        System.out.print("Enter start index: ");
        int start = scanner.nextInt();
        System.out.print("Enter end index: ");
        int end = scanner.nextInt();

        String manualSub = customSubstring(text, start, end);
        String builtInSub = text.substring(start, end);

        boolean isSame = compareStrings(manualSub, builtInSub);

        System.out.println("Custom substring: " + manualSub);
        System.out.println("Built-in substring: " + builtInSub);
        System.out.println("Are they equal? " + isSame);
    }
}