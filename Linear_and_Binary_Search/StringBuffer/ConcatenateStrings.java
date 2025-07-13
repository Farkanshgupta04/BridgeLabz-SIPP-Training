public class ConcatenateStrings {
    public static void main(String[] args) {
        String[] arr = {"Java", "is", "fun"};
        StringBuffer buffer = new StringBuffer();

        for (String s : arr) {
            buffer.append(s).append(" ");
        }

        System.out.println("Concatenated: " + buffer.toString().trim());
    }
}