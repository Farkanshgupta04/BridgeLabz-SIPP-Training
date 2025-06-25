

import java.util.Scanner;

public class WordLengthTable {

    static int getLength(String str) {
        char[] c = str.toCharArray();
        int count = 0;
        for (char ch : c) count++;
        return count;
    }

    static String[] splitWords(String text) {
        int len = getLength(text);
        int wordCount = 1;
        for (int i = 0; i < len; i++)
            if (text.charAt(i) == ' ') wordCount++;

        String[] words = new String[wordCount];
        int index = 0;
        String current = "";

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            if (ch != ' ') current += ch;
            else {
                words[index++] = current;
                current = "";
            }
        }
        words[index] = current;
        return words;
    }

    static String[][] wordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] result = wordsWithLengths(words);

        System.out.printf("%-15s %-10s\n", "Word", "Length");
        System.out.println("------------------------------");
        for (String[] row : result)
            System.out.printf("%-15s %-10s\n", row[0], row[1]);
    }
}
