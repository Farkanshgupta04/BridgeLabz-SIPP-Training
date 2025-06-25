package Java_Strings.Level-03;

import java.util.Scanner;

public class UniqueCharacters {

    static int getLength(String str) {
        char[] c = str.toCharArray();
        int len = 0;
        for (char ch : c) len++;
        return len;
    }

    static char[] findUniques(String str) {
        int len = getLength(str);
        char[] uniques = new char[len];
        int k = 0;

        for (int i = 0; i < len; i++) {
            char current = str.charAt(i);
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == current) {
                    found = true;
                    break;
                }
            }
            if (!found) uniques[k++] = current;
        }

        char[] result = new char[k];
        for (int i = 0; i < k; i++) result[i] = uniques[i];
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] result = findUniques(input);
        System.out.print("Unique characters: ");
        for (char c : result) System.out.print(c + " ");
    }
}