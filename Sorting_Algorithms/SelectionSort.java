public class SelectionSort {
    public static void main(String[] args) {
        int[] scores = {45, 67, 89, 32, 76};
        for (int i = 0; i < scores.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < scores.length; j++) {
                if (scores[j] < scores[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = scores[minIdx];
            scores[minIdx] = scores[i];
            scores[i] = temp;
        }

        System.out.print("Sorted Exam Scores: ");
        for (int score : scores) {
            System.out.print(score + " ");
        }
    }
}