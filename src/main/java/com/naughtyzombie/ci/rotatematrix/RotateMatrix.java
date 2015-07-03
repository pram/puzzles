package com.naughtyzombie.ci.rotatematrix;

import com.naughtyzombie.ci.lib.AssortedMethods;

/**
 * Created by pram on 02/07/2015.
 */
public class RotateMatrix {
    public static void rotate(int[][] matrix, int n) {
        for (int layer = 0; layer < n / 2; ++layer) {
            int first = layer;
            int last = n - 1 - layer;
            for (int i = first; i < last; ++i) {
                int offset = i - first;
                int top = matrix[first][i]; // save top

                // left -> top
                matrix[first][i] = matrix[last - offset][first];

                // bottom -> left
                matrix[last - offset][first] = matrix[last][last - offset];

                // right -> bottom
                matrix[last][last - offset] = matrix[i][last];

                // top -> right
                matrix[i][last] = top; // right <- saved top
            }
        }
    }

    public static void rotate2(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        System.out.println("rows = " + rows + " columns = " + columns);
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {

            }
        }
    }

    public static void swap(int[][] arr, int row1, int col1, int row2, int col2){
        int num1 = arr[row1][col1];
        int num2 = arr[row2][col2];
        arr[row1][col1] = num2;
        arr[row2][col2] = num1;
    }

    public static void main(String[] args) {
        int[][] matrix = AssortedMethods.randomMatrix(10, 10, 0, 9);
        AssortedMethods.printMatrix(matrix);
//        rotate(matrix, 10);
        rotate2(matrix);
        System.out.println();
        AssortedMethods.printMatrix(matrix);
    }
}
