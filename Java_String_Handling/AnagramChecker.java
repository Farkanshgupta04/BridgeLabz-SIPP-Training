package Java_String_Handling;

import java.util.Scanner;

public class AnagramChecker {
    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;

        int[] freq = new int[256];
        for (int i = 0; i < a.length(); i++) {
            freq[a.charAt(i)]++;
            freq[b.charAt(i)]--;
        }

        for (int count : freq) {
            if (count != 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine().replaceAll("\\s", "");
        String str2 = sc.nextLine().replaceAll("\\s", "");

        System.out.println("Anagrams? " + isAnagram(str1.toLowerCase(), str2.toLowerCase()));
    }
}