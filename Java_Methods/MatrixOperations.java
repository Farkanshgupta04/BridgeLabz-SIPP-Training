package Java_Methods;

public class MatrixOperations {
    public static int[][] generateRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = (int) (Math.random() * 10);
        return matrix;
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                transpose[j][i] = matrix[i][j];
        return transpose;
    }

    public static int determinant2x2(int[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    public static void main(String[] args) {
        int[][] matrix = generateRandomMatrix(2, 2);
        System.out.println("Generated Matrix:");
        for (int[] row : matrix) System.out.println(java.util.Arrays.toString(row));

        System.out.println("Transpose:");
        int[][] transposed = transposeMatrix(matrix);
        for (int[] row : transposed) System.out.println(java.util.Arrays.toString(row));

        System.out.println("Determinant of 2x2 Matrix: " + determinant2x2(matrix));
    }
}
