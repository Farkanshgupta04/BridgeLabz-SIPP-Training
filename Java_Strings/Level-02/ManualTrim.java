package Java_Strings.Level-02;

import java.util.Scanner;

public class ManualTrim {

    static int[] findTrimIndices(String str) {
        int start = 0, end = str.length() - 1;

        while (start < str.length() && str.charAt(start) == ' ') start++;
        while (end >= 0 && str.charAt(end) == ' ') end--;

        return new int[]{start, end + 1}; 
    }

    static String manualSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) result += str.charAt(i);
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
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int[] bounds = findTrimIndices(input);
        String manual = manualSubstring(input, bounds[0], bounds[1]);
        String builtIn = input.trim();

        System.out.println("Manual Trimmed: '" + manual + "'");
        System.out.println("Built-in Trimmed: '" + builtIn + "'");
        System.out.println("Equal? " + compare(manual, builtIn));
    }
}
