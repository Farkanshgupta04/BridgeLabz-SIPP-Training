package Java_String_Handling;

public class MostFrequentChar {
    public static void main(String[] args) {
        String str = "success";
        int[] freq = new int[256];

        for (char c : str.toCharArray())
            freq[c]++;

        int max = 0;
        char maxChar = ' ';
        for (char c : str.toCharArray()) {
            if (freq[c] > max) {
                max = freq[c];
                maxChar = c;
            }
        }
        System.out.println("Most Frequent Character: '" + maxChar + "'");
    }
}
