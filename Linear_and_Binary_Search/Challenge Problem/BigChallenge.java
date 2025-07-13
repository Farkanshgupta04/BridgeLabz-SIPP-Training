import java.io.*;

public class BigChallenge {
    public static void main(String[] args) throws IOException {
        int loops = 1000000;
        String word = "hello";

        long start1 = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < loops; i++) sb.append(word);
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        StringBuffer sf = new StringBuffer();
        for (int i = 0; i < loops; i++) sf.append(word);
        long end2 = System.nanoTime();

        System.out.println("Builder Time: " + (end1 - start1));
        System.out.println("Buffer Time: " + (end2 - start2));

        BufferedReader fr = new BufferedReader(new FileReader("bigfile.txt"));
        BufferedReader ir = new BufferedReader(new InputStreamReader(new FileInputStream("bigfile.txt"), "UTF-8"));

        int wordCount = 0;
        String line;
        while ((line = fr.readLine()) != null) wordCount += line.split("\\s+").length;
        fr.close();

        System.out.println("Word count via FileReader: " + wordCount);
        // You can repeat for InputStreamReader if needed
    }
}