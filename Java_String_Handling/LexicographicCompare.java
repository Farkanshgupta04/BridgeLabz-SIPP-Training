package Java_String_Handling;

public class LexicographicCompare {
    public static void main(String[] args) {
        String s1 = "apple", s2 = "banana";
        int len = Math.min(s1.length(), s2.length());
        boolean equal = true;

        for (int i = 0; i < len; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                equal = false;
                if (s1.charAt(i) < s2.charAt(i))
                    System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\"");
                else
                    System.out.println("\"" + s2 + "\" comes before \"" + s1 + "\"");
                break;
            }
        }

        if (equal) {
            if (s1.length() < s2.length())
                System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\"");
            else if (s1.length() > s2.length())
                System.out.println("\"" + s2 + "\" comes before \"" + s1 + "\"");
            else
                System.out.println("Both strings are equal");
        }
    }
}
