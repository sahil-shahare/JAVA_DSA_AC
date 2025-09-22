public class Spiral_Matrix {

    public static void printSpiralMatrix(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }
            // right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }
            // bottom
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow)
                    break; // avoid double printing
                System.out.print(matrix[endRow][j] + " ");
            }
            // left
            for (int i = endRow - 1; i > startRow; i--) {
                if (startCol == endCol)
                    break; // avoid double printing
                System.out.print(matrix[i][startCol] + " ");
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        System.out.println();
    }

    // Diagonal Sum
    public static void diagonalSum(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            // pd
            sum += matrix[i][i];
            // sd
            if (i != matrix.length - 1 - i) {
                sum += matrix[i][matrix.length - 1 - i];
            }
        }
        System.out.println("Sum : " + sum);

    }

    // Search
    public static void staircaseSearch(int matrix1[][], int key) {
        int row = 0;
        int col = matrix1[0].length - 1;

        while (row < matrix1.length && col >= 0) {
            if (matrix1[row][col] == key) {
                System.out.println("Found key at : (" + row + "," + col + ")");
                return; // should stop after finding
            } else if (key < matrix1[row][col]) {
                col--; // move left
            } else {
                row++; // move down
            }
        }
        System.out.println("Key not found!"); // handle not found
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        int[][] matrix1 = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };
        printSpiralMatrix(matrix);
        diagonalSum(matrix);
        staircaseSearch(matrix1, 33);
    }
}
