import java.io.*;

public class FileReadComparison {
    public static void main(String[] args) throws Exception {
        // FileReader
        long startFR = System.nanoTime();
        BufferedReader br1 = new BufferedReader(new FileReader("large.txt"));
        while (br1.readLine() != null) {}
        br1.close();
        long endFR = System.nanoTime();

        // InputStreamReader
        long startISR = System.nanoTime();
        BufferedReader br2 = new BufferedReader(new InputStreamReader(new FileInputStream("large.txt"), "UTF-8"));
        while (br2.readLine() != null) {}
        br2.close();
        long endISR = System.nanoTime();

        System.out.println("FileReader Time: " + (endFR - startFR) / 1_000_000 + " ms");
        System.out.println("InputStreamReader Time: " + (endISR - startISR) / 1_000_000 + " ms");
    }
}