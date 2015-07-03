package com.naughtyzombie.ci.rotatematrix;

import com.naughtyzombie.ci.lib.AssortedMethods;

/**
 * Created by pram on 02/07/2015.
 */
public class RotateMatrix {
    public static void rotate(int[][] matrix, int n) {
        //Layers
        for (int layer = 0; layer < n / 2; ++layer) {
            int first = layer;
            int last = n - 1 - layer;
            //Elements
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
        transpose(matrix);
        reflect(matrix);
    }

    public static void reflect(int[][] arr) {
        int size = arr.length;
        for (int k = 0; k < size; k++) {
            for (int i = 0; i < Math.floor(size / 2); i++) {
                swap(arr, k, i, k, size - i - 1);
            }
        }
    }

    public static void transpose(int[][] arr) {
        int size = arr.length;
        for (int diag = 0; diag < size; diag++) {
            for (int i = diag + 1; i < size; i++) {
                swap(arr, diag, i, i, diag);
            }
        }
    }

    public static void swap(int[][] arr, int row1, int col1, int row2, int col2) {
        int num1 = arr[row1][col1];
        int num2 = arr[row2][col2];
        arr[row1][col1] = num2;
        arr[row2][col2] = num1;
    }

    public static void rotate3(int[][] matrix) {
        int n = matrix.length;
        if (n <= 1) {
            return; // nothing to do
        }

        /* layers */
        for (int i = 0; i < n / 2; i++) {
            /* elements */
            for (int j = i; j < n - i - 1; j++) {
                int saved = matrix[i][j];
                matrix[i][j] = matrix[n - j - 1][i];
                matrix[n - j - 1][i] = matrix[n - 1 - i][n - 1 - j];
                matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];
                matrix[j][n - 1 - i] = saved;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = AssortedMethods.randomMatrix(5, 5, 0, 9);
        AssortedMethods.printMatrix(matrix);
//        rotate(matrix, 10);
//        rotate2(matrix);
        rotate3(matrix);
        System.out.println();
        AssortedMethods.printMatrix(matrix);
    }
}
