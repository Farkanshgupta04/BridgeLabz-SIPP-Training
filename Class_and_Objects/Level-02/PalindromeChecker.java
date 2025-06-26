package OOPS.Class_and_Objects.Level-02;

class PalindromeChecker {
    String text;

    boolean isPalindrome() {
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        String reverse = new StringBuilder(clean).reverse().toString();
        return clean.equals(reverse);
    }

    void displayResult() {
        System.out.println("Text: " + text);
        if (isPalindrome()) {
            System.out.println("It's a palindrome.");
        } else {
            System.out.println("Not a palindrome.");
        }
    }

    public static void main(String[] args) {
        PalindromeChecker pc = new PalindromeChecker();
        pc.text = "Madam";
        pc.displayResult();
    }
}