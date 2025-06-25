package Java_Strings.Level-02;

public class ShortestLongest {

    static int getLength(String str) {
        char[] chars = str.toCharArray();
        int count = 0;
        for (char ch : chars) count++;
        return count;
    }

    static String[] splitWords(String text) {
        int len = getLength(text);
        int wordCount = 1;
        for (int i = 0; i < len; i++)
            if (text.charAt(i) == ' ') wordCount++;

        String[] words = new String[wordCount];
        int index = 0;
        String current = "";

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            if (ch != ' ') current += ch;
            else {
                words[index++] = current;
                current = "";
            }
        }
        words[index] = current;
        return words;
    }

    static String findShortest(String[] words) {
        String shortest = words[0];
        for (String word : words)
            if (getLength(word) < getLength(shortest))
                shortest = word;
        return shortest;
    }

    static String findLongest(String[] words) {
        String longest = words[0];
        for (String word : words)
            if (getLength(word) > getLength(longest))
                longest = word;
        return longest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] words = splitWords(text);
        System.out.println("Shortest Word: " + findShortest(words));
        System.out.println("Longest Word : " + findLongest(words));
    }
}