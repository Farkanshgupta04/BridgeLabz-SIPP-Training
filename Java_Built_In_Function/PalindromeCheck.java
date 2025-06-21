import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        if (isPalindrome(str))
            System.out.println("It's a palindrome.");
        else
            System.out.println("Not a palindrome.");
    }

    static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("\\s+", "");
        return s.equals(new StringBuilder(s).reverse().toString());
    }
}