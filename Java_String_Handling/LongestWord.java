package Java_String_Handling;

public class LongestWord {
    public static void main(String[] args) {
        String sentence = "This is a demonstration of the longestword";
        String[] words = sentence.split(" ");
        String longest = "";
        for (String word : words)
            if (word.length() > longest.length()) longest = word;
        System.out.println("Longest word: " + longest);
    }
}
