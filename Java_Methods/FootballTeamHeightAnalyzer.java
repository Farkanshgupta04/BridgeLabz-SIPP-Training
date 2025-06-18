package Java_Methods;

public class FootballTeamHeightAnalyzer {
    public static int[] generateRandomHeights(int numPlayers) {
        int[] heights = new int[numPlayers];
        for (int i = 0; i < numPlayers; i++) {
            heights[i] = 150 + (int) (Math.random() * 101); 
        }
        return heights;
    }

    public static int findShortestHeight(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) shortest = height;
        }
        return shortest;
    }

    public static int findTallestHeight(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) tallest = height;
        }
        return tallest;
    }

    public static double findMeanHeight(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return (double) sum / heights.length;
    }

    public static void main(String[] args) {
        int[] heights = generateRandomHeights(11);
        System.out.println("Shortest Height: " + findShortestHeight(heights));
        System.out.println("Tallest Height: " + findTallestHeight(heights));
        System.out.println("Mean Height: " + findMeanHeight(heights));
    }
}
