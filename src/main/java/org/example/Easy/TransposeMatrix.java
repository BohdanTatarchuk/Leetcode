package org.example.Easy;

import java.util.Random;

public class TransposeMatrix {
    Random rand = new Random();
    public void fillMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int j = 0; j < rows; j++) {
            for (int i = 0; i < columns; i++) {
                matrix[j][i] = rand.nextInt(15);
            }
        }

    }

    public int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] result = new int[columns][rows];

        for (int j = 0; j < rows; j++) {
            for (int i = 0; i < columns; i++) {
                result[i][j] = matrix[j][i];
            }
        }

        return result;
    }
}
