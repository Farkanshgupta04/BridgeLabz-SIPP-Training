package Java_Strings.Level-02;

import java.util.Scanner;

public class ManualSplit {

    static int getLength(String text) {
        char[] chars = text.toCharArray();
        int count = 0;
        for (char c : chars) count++;
        return count;
    }

    static String[] splitWords(String text) {
        int len = getLength(text);
        int spaces = 0;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') spaces++;
        }

        String[] words = new String[spaces + 1];
        int wordIndex = 0;
        String current = "";

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                current += ch;
            } else {
                words[wordIndex++] = current;
                current = "";
            }
        }

        words[wordIndex] = current; // last word
        return words;
    }

    static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] manual = splitWords(text);
        String[] builtin = text.split(" ");
        boolean same = compareArrays(manual, builtin);

        System.out.println("Manual Split:");
        for (String word : manual) System.out.println(word);
        System.out.println("Arrays are equal: " + same);
    }
}
