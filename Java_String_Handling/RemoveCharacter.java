package Java_String_Handling;

public class RemoveCharacter {
    public static void main(String[] args) {
        String input = "Hello World";
        char toRemove = 'l';
        String result = "";
        for (char c : input.toCharArray()) {
            if (c != toRemove) result += c;
        }
        System.out.println("Modified String: " + result);
    }
}
