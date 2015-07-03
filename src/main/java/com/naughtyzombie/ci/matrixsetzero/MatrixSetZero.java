package com.naughtyzombie.ci.matrixsetzero;

import com.naughtyzombie.ci.lib.AssortedMethods;

/**
 * Created by pram on 02/07/2015.
 */
public class MatrixSetZero {

    public static void main(String[] args) {
        int[][] matrix = AssortedMethods.randomMatrix(5, 5, 0, 9);
        AssortedMethods.printMatrix(matrix);
        matrixSetZero(matrix);
        System.out.println();
        AssortedMethods.printMatrix(matrix);
    }

    private static void matrixSetZero(int[][] matrix) {
        int rows = matrix.length;
        boolean[] zeroRows = new boolean[rows];
        int columns = matrix[0].length;
        boolean[] zeroColumns = new boolean[columns];

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                if (matrix[r][c] == 0) {
                    zeroRows[r] = true;
                    zeroColumns[c] = true;
                }
            }
        }

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                if (zeroRows[r] || zeroColumns[c]) {
                    matrix[r][c] = 0;
                }
            }
        }

    }
}
