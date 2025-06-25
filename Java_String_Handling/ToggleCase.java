package Java_String_Handling;

public class ToggleCase {
    public static void main(String[] args) {
        String input = "Hello World";
        String result = "";
        for (char ch : input.toCharArray()) {
            if (Character.isUpperCase(ch)) result += Character.toLowerCase(ch);
            else if (Character.isLowerCase(ch)) result += Character.toUpperCase(ch);
            else result += ch;
        }
        System.out.println("Toggled: " + result);
    }
}