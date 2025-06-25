package Java_String_Handling;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "programming";
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            if (result.indexOf(input.charAt(i)) < 0)
                result += input.charAt(i);
        }
        System.out.println("Without duplicates: " + result);
    }
}
