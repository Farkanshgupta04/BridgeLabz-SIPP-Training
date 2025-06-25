package Java_Strings.Level-03;

import java.util.Scanner;

public class FrequencyWithUniques {

    static char[] uniqueChars(String str) {
        int len = str.length();
        char[] result = new char[len];
        int index = 0;

        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            boolean unique = true;
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == ch) {
                    unique = false;
                    break;
                }
            }
            if (unique) result[index++] = ch;
        }

        char[] finalResult = new char[index];
        for (int i = 0; i < index; i++) finalResult[i] = result[i];
        return finalResult;
    }

    static int[] frequency(String str) {
        int[] freq = new int[256];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }
        return freq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] uniques = uniqueChars(str);
        int[] freq = frequency(str);

        System.out.println("Char : Frequency");
        for (char c : uniques) {
            System.out.println(c + " : " + freq[c]);
        }
    }
}
