import java.io.*;

public class WordCount {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String target = "Java";
        int count = 0, lineCount = 0;
        String line;
        while ((line = br.readLine()) != null) {
            lineCount++;
            String[] words = line.split("\\s+");
            for (String word : words) {
                if (word.equalsIgnoreCase(target)) count++;
            }
        }
        br.close();
        System.out.println("Occurrences of '" + target + "': " + count);
    }
}