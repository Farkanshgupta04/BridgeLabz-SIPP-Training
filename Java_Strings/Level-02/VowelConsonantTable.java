package Java_Strings.Level-02;

import java.util.Scanner;

public class VowelConsonantTable {

    static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return "aeiou".indexOf(c) != -1;
    }

    static boolean isLetter(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }

    static String getType(char c) {
        if (!isLetter(c)) return "Not a Letter";
        return isVowel(c) ? "Vowel" : "Consonant";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        System.out.printf("%-10s %-15s\n", "Char", "Type");
        System.out.println("---------------------------");
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            System.out.printf("%-10c %-15s\n", ch, getType(ch));
        }
    }
}
