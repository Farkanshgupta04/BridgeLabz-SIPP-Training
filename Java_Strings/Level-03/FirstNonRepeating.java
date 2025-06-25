package Java_Strings.Level-03;

import java.util.Scanner;

public class FirstNonRepeating {

    static int[] buildFrequency(String str) {
        int[] freq = new int[256];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }
        return freq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int[] freq = buildFrequency(input);

        for (int i = 0; i < input.length(); i++) {
            if (freq[input.charAt(i)] == 1) {
                System.out.println("First non-repeating character: " + input.charAt(i));
                return;
            }
        }
        System.out.println("No non-repeating character found.");
    }
}
