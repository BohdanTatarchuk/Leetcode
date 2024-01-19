package org.example;

import org.example.Easy.ClimbStairs;
import org.example.Easy.TransposeMatrix;

import java.util.Arrays;

public class Main {
    static ClimbStairs cs = new ClimbStairs();
    static TransposeMatrix tm = new TransposeMatrix();
    static int[][] matrix = new int[2][3];
    public static void main(String[] args) {
        //System.out.println("Result: " + cs.climb(10));

        tm.fillMatrix(matrix);
        System.out.println(Arrays.deepToString(matrix));
        System.out.println(Arrays.deepToString(tm.transpose(matrix)));
    }
}