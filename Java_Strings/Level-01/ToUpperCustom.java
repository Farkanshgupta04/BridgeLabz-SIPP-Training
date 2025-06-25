package Java_Strings.Level-01;

import java.util.Scanner;

public class ToUpperCustom {

    static String customToUpper(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') {
                result += (char)(c - 32);
            } else {
                result += c;
            }
        }
        return result;
    }

    static boolean compare(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        String manual = customToUpper(text);
        String builtIn = text.toUpperCase();

        System.out.println("Custom Uppercase: " + manual);
        System.out.println("Built-in Uppercase: " + builtIn);
        System.out.println("Match? " + compare(manual, builtIn));
    }
}
