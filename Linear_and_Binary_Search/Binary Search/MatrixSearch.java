public class MatrixSearch {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5},
            {7, 9, 11},
            {13, 15, 17}
        };
        int target = 9;
        int rows = matrix.length, cols = matrix[0].length;
        int left = 0, right = rows * cols - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int r = mid / cols, c = mid % cols;
            if (matrix[r][c] == target) {
                System.out.println("Found");
                return;
            } else if (matrix[r][c] < target) left = mid + 1;
            else right = mid - 1