import java.io.*;

public class ConsoleToFile {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

        String input;
        while (!(input = reader.readLine()).equalsIgnoreCase("exit")) {
            writer.write(input);
            writer.newLine();
        }

        reader.close();
        writer.close();
        System.out.println("Input saved to output.txt");
    }
}