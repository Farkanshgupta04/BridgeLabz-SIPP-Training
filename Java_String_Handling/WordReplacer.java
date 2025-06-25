package Java_String_Handling;

public class WordReplacer {
    static String replaceWord(String sentence, String oldWord, String newWord) {
        String[] words = sentence.split(" ");
        String result = "";
        for (String word : words) {
            if (word.equals(oldWord)) result += newWord + " ";
            else result += word + " ";
        }
        return result.trim();
    }

    public static void main(String[] args) {
        String sentence = "Java is awesome and Java is powerful";
        String modified = replaceWord(sentence, "Java", "Python");
        System.out.println("Modified Sentence: " + modified);
    }
}