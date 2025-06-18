package Java_Methods;

public class NumberChecker {
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    public static int[] getDigitsArray(int num) {
        String strNum = String.valueOf(num);
        int[] digits = new int[strNum.length()];
        for (int i = 0; i < strNum.length(); i++) {
            digits[i] = Character.getNumericValue(strNum.charAt(i));
        }
        return digits;
    }

    public static boolean isPalindrome(int num) {
        int[] digits = getDigitsArray(num);
        for (int i = 0; i < digits.length / 2; i++) {
            if (digits[i] != digits[digits.length - 1 - i]) return false;
        }
        return true;
    }

    public static boolean isDuckNumber(int num) {
        return String.valueOf(num).contains("0");
    }

    public static void main(String[] args) {
        System.out.println("Count of digits in 12345: " + countDigits(12345));
        System.out.println("Is 121 a palindrome? " + isPalindrome(121));
        System.out.println("Is 1023 a Duck Number? " + isDuckNumber(1023));
    }
}