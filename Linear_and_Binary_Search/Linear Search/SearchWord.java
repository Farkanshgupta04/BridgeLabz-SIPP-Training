public class SearchWord {
    public static void main(String[] args) {
        String[] sentences = {
            "I love Java.",
            "Programming is fun.",
            "Practice daily."
        };
        String target = "Java";
        for (String sentence : sentences) {
            if (sentence.contains(target)) {
                System.out.println("Found: " + sentence);
                return;
            }
        }
        System.out.println("Not Found");
    }
}